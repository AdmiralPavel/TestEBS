package com.example.testebs;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class lastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView4);
        boolean success = (boolean) getIntent().getExtras().get("checkVerified");
        if (success)
            imageView.setImageResource(R.drawable.done);
        else {
            imageView.setImageResource(R.drawable.undone);
            textView.setText("Ошибка! Идентификация не удалась!");
        }
    }
}
