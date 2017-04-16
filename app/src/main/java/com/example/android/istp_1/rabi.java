package com.example.android.istp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class rabi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabi2);

        ListView listview ;
        listview=(ListView)findViewById(R.id.list2);
        String[] values2=getResources().getStringArray(R.array.rabi);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.activity_list_item,android.R.id.text1,values2);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi .this,paddy.class);
                    startActivity(intent);

                }
                if(position==1)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi.this,guar.class);
                    startActivity(intent);

                }
                if(position==2)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi.this,jowar.class);
                    startActivity(intent);

                }
                if(position==3)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi.this,soyabean.class);
                    startActivity(intent);

                }
                if(position==4)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi.this,maize.class);
                    startActivity(intent);

                }
                if(position==5)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi.this,urid.class);
                    startActivity(intent);

                }
                if(position==6)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi.this,bajri.class);
                    startActivity(intent);

                }
                if(position==7)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi.this,arhar.class);
                    startActivity(intent);

                }
                if(position==8)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi.this,ground_nut.class);
                    startActivity(intent);

                }
                if(position==9)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi.this,fennel.class);
                    startActivity(intent);

                }
                if(position==10)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi.this,nagali.class);
                    startActivity(intent);

                }
                if(position==11)
                {
                    //Toast.makeText(MainActivity.this,"i am in position",Toast.LENGTH_LONG).show();
                    Intent intent= new Intent(rabi.this,castor.class);
                    startActivity(intent);

                }


            }
        });
    }
}
