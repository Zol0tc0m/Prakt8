package com.example.prakt8;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TweenAnimActivity extends AppCompatActivity {

    private ImageView imgAnim;
    private Button startBtn;
    private Button pauseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tween_anim);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        imgAnim = findViewById(R.id.img_blink);
        startBtn = findViewById(R.id.start_tween);
        pauseBtn = findViewById(R.id.pause_tween);

        startBtn.setAlpha(0f);
        pauseBtn.setAlpha(0f);
        startBtn.animate()
                .alpha(1f)
                .setDuration(1000)
                .setStartDelay(500)
                .start();
        pauseBtn.animate()
                .alpha(1f)
                .setDuration(1000)
                .setStartDelay(500)
                .start();

        Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAnim.startAnimation(blinkAnimation);
            }
        });
        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAnim.clearAnimation();
            }
        });
    }
}