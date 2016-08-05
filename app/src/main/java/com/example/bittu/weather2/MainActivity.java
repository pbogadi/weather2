package com.example.bittu.weather2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bittu.weather2.POJO.Model;

import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;




public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2, textView3, textView4;
    String url = "http://api.openweathermap.org";

    // made changes in downloaded branch: Master
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView) findViewById(R.id.txt1);
        textView2 = (TextView) findViewById(R.id.txt2);
        textView3 = (TextView) findViewById(R.id.txt3);
//        textView4 = (TextView) findViewById(R.id.txt4);

        getReport();
    }

    public void getReport() {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RestInterface service = retrofit.create(RestInterface.class);

        retrofit.Call<Model> call = service.getWheatherReport();

        call.enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Response<Model> response, Retrofit retrofit) {

                try {
//                    String city = response.body().getName();
                    String city2= response.body().getCod();
                    String message=response.body().getMessage();
                    String count=response.body().getCnt();

//                    String status = response.body().getWeather().get(0).getDescription();
//
//                    String humidity = response.body().getMain().getHumidity().toString();
//
//                    String pressure = response.body().getMain().getPressure().toString();

                    textView1.setText("city  :  " + city2);
                    textView2.setText("status  :  " + message);
                    textView3.setText("humidity  : " + count);
//                    txt_pressure.setText("pressure  :  " + pressure);
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "TRY-CATCH BLOCK", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Throwable t) {
                Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
            }
        });


    }

}
