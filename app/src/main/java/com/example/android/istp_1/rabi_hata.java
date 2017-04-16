package com.example.android.istp_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class rabi_hata extends AppCompatActivity {
    GridView gridView;
    String lettersList[]={"Maize [मक्का]","Wheat [गेहूं]","Barley [जौ]","Red-Rice [लाल चावल]","Kodra [कोद्र]","cauliflower [गोभी]","Cabbage [गोभी]","Capsicum [शिमला मिर्च]"};
    int letterIcon[]={R.drawable.rsz_maize,R.drawable.rsz_wheat,R.drawable.rsz_barley,R.drawable.rsz_red_rice,R.drawable.rsz_kodra,R.drawable.rsz_cauli,R.drawable.rsz_cabbage,R.drawable.rsz_capsicum};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rabi_hata);

        gridView=(GridView)findViewById(R.id.gv);

        GridAdapter adapter=new GridAdapter(this,letterIcon,lettersList);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi_hata.this,maize.class);
                    startActivity(intent);

                }

                if(position==1)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi_hata.this,wheat.class);
                    startActivity(intent);

                }

                if(position==2)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi_hata.this,paddy.class);
                    startActivity(intent);

                }

                if(position==3)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi_hata.this,paddy.class);
                    startActivity(intent);

                }

                if(position==4)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi_hata.this,paddy.class);
                    startActivity(intent);

                }

                if(position==5)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi_hata.this,paddy.class);
                    startActivity(intent);

                }

                if(position==6)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi_hata.this,paddy.class);
                    startActivity(intent);

                }

                if(position==7)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi_hata.this,paddy.class);
                    startActivity(intent);

                }
            }
        });
    }
}
