package com.example.prakt8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button Frame_Button, Tween_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        Frame_Button = findViewById(R.id.Frame_button);
        Tween_Button = findViewById(R.id.Tween_button);

        Frame_Button.setAlpha(0f);
        Tween_Button.setAlpha(0f);
        Frame_Button.setTranslationY(50);
        Tween_Button.setTranslationY(50);

        Frame_Button.animate()
                .alpha(1f)
                .translationY(0)
                .setDuration(1000)
                .setStartDelay(500)
                .start();

        Tween_Button.animate()
                .alpha(1f)
                .translationY(0)
                .setDuration(1000)
                .setStartDelay(700)
                .start();

        Frame_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FrameActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
        Tween_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TweenAnimActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }
}