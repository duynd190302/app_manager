package com.manager.appbanhang.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.manager.appbanhang.R;

import io.paperdb.Paper;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);
        Paper.init(this);
        Thread thread = new Thread() {
            public void run() {
                try {
                    // Thời gian chờ cho màn hình splash
                    sleep(1500);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // Kiểm tra xem có thông tin người dùng trong Paper hay không
                    if (Paper.book().read("user") == null) {
                        // Chuyển sang màn hình đăng nhập nếu không có thông tin người dùng
                        Intent intent = new Intent(getApplicationContext(), DangnhapActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        // Chuyển sang màn hình chính nếu có thông tin người dùng
                        Intent home = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(home);
                        finish();
                    }
                }
            }
        };
        thread.start();
    }
}