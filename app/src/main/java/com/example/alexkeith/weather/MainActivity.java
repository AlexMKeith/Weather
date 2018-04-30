package com.example.alexkeith.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.alexkeith.weather.api_calls.dark_sky.DarkSkyApi;
import com.example.alexkeith.weather.api_calls.google.GoogleGeoApi;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private GoogleGeoApi mGoogleGeoApi;
    private String mGoogleBaseUrl;
    private String mGoogleApiKey;
    private Retrofit mGoogleRetrofit;
    private DarkSkyApi mDarkSkyApi;
    private String mDarkSkyBaseUrl;
    private String mDarkSkyApiKey;
    private Retrofit mDarkSkyRetrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
