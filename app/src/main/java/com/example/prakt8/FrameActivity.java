package com.example.prakt8;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FrameActivity extends AppCompatActivity {

    private ImageView AnimationIV;
    private Button StartBtn;
    private Button PauseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_frame_anim);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        AnimationIV = findViewById(R.id.frame_anim_iv);
        StartBtn = findViewById(R.id.start_frame);
        PauseBtn = findViewById(R.id.pause_frame);

        StartBtn.setAlpha(0f);
        PauseBtn.setAlpha(0f);
        StartBtn.setTranslationX(-500f);
        PauseBtn.setTranslationX(500f);
        StartBtn.animate()
                .alpha(1f)
                .translationX(0f)
                .setDuration(1000)
                .setStartDelay(500)
                .start();
        PauseBtn.animate()
                .alpha(1f)
                .translationX(0f)
                .setDuration(1000)
                .setStartDelay(500)
                .start();

        AnimationDrawable frameAnimation = (AnimationDrawable) AnimationIV.getDrawable();

        StartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {frameAnimation.start(); }
            }
        });

        PauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {frameAnimation.stop(); }
            }
        });
    }
}