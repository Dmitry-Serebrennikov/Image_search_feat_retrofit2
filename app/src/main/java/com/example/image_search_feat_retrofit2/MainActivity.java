package com.example.image_search_feat_retrofit2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomApp.getPixabayAPI().getAllData(CustomApp.KEY).enqueue(new Callback<List<Hit>>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(Call<List<Hit>> call, Response<List<Hit>> response) {
                Toast.makeText(MainActivity.this,"done", Toast.LENGTH_LONG).show();
                //response.body().forEach(x -> System.out.println("x = " + x));
            }

            @Override
            public void onFailure(Call<List<Hit>> call, Throwable t) {
                Toast.makeText(MainActivity.this,"fail", Toast.LENGTH_LONG).show();

            }
        });


    }
}