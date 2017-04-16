package com.example.android.istp_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class second extends AppCompatActivity {
    ImageButton image_rabi;
    ImageButton ib2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        image_rabi=(ImageButton)findViewById(R.id.ib_rabi);

        image_rabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(second.this,rabi_hata.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_in_right);
            }
        });

        ib2=(ImageButton)findViewById(R.id.ib2);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(second.this,kharif.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_in_right);
            }
        });

    }
}
