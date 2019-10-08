package com.example.testebs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String defaultLine = "Чтобы получить биометрический доступ:" + "\n" +
            "- ваше лицо должно быть хорошо видно;" + "\n" +
            "- в помещении должно быть светло и тихо;" + "\n" +
            "- если вы регистрировались в очках - наденьте их, если без - снимите.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView notification = findViewById(R.id.textView3);
        notification.setText(defaultLine);

        Button btn = findViewById(R.id.buttonStart);
        btn.setTextColor(Color.WHITE);

        btn.setOnClickListener((v)-> {
            Intent intent = new Intent(this, loadingVideo.class);
            startActivity(intent);
        });
    }
}
