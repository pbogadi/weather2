package com.example.bittu.weather2;

import com.example.bittu.weather2.POJO.Model;

import retrofit.Call;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by BITTU on 5/31/2016.
 */
public interface RestInterface {

        @GET("/data/2.5/forecast/daily?q=london&mode=json&units=metric&cnt=7&appid=e2328fe6db5449f7db67cf8bfdaab212")
//        void getWheatherReport(Callback<Model> cb);
        Call<Model> getWheatherReport();
        //second change in master branch
        //third change in master branch
        //fourth change in master branch



        //1st changes in branch-1
        //2nd change in branch-1
        //3rd change in branch-1


        //1st change in branch-2
        //


        //fifth change in master branch
        //sixth change in master branch
        //seventh change in master branch
}
