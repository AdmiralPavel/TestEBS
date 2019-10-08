package com.example.testebs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    String defaultLine = "Чтобы получить биометрический доступ:" + "\n" +
            "- ваше лицо должно быть хорошо видно;" + "\n" +
            "- в помещении должно быть светло и тихо;" + "\n" +
            "- если вы регистрировались в очках - наденьте их, если без - снимите.";

    int checkVerified = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView notification = findViewById(R.id.textView3);
        notification.setText(defaultLine);

        Button btn = findViewById(R.id.buttonStart);
        btn.setTextColor(Color.WHITE);


        Switch sw = (Switch) findViewById(R.id.monitored_switch);
        if (sw != null) {
            sw.setOnCheckedChangeListener(this);
        }

        btn.setOnClickListener((v)-> {
            Intent intent = new Intent(this, CameraActivity.class);
            startActivity(intent);
            finish();
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        checkVerified = isChecked ? 1 : 0;
        Toast.makeText(this, "Вернет результат: " + (isChecked ? "OK" : "NOT OK"),
                Toast.LENGTH_SHORT).show();
    }
}
