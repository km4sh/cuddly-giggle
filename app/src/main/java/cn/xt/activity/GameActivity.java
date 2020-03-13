package cn.xt.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 去除标题栏
        getSupportActionBar().hide();
        setContentView(R.layout.activity_game);
    }
}
