package com.example.android.istp_1;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class maize extends AppCompatActivity {
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maize);

        TextView textView = (TextView) findViewById(R.id.textView2_maize);
        textView.setMovementMethod(new ScrollingMovementMethod());
        new MyAsyncTask().execute("maize");
        Button bt;
        bt=(Button)findViewById(R.id.button_maize);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent(maize.this,rabi_hata.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_in_right);
            }
        });
    }

    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
            .url("http://10.8.16.81/maize.php")
            .build();

    private class MyAsyncTask extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... params) {
            try {
                Response response = client.newCall(request).execute();
                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Call call, final Response response) throws IOException {
                        if (!response.isSuccessful()) {
                            throw new IOException("Unexpected code " + response);
                        } else {
                            //final TextView tv=(TextView) findViewById(R.id.tv11);
                            //response.body().string();
                            //s=(String) response.body().string();
                            //Toast.makeText(paddy.this,s,Toast.LENGTH_LONG).show();
                            showToast(response.body().string());
                            //tv.setText(s);
                            //Log.d("response", response.body().string()+"");
                        }
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public void showToast(final String toast)
    {
        runOnUiThread(new Runnable() {
            public void run()
            {
                TextView tv;
                toast.concat("  kg.");
                tv=(TextView)findViewById(R.id.tv_maize);
                tv.setText(toast);
                //   Toast.makeText(paddy.this, toast, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
