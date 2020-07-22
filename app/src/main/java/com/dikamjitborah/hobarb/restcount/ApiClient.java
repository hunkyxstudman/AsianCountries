package com.dikamjitborah.hobarb.restcount;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    static String BASE_URL = "https://restcountries.eu/";
    static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if(retrofit==null)
        {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;
    }


}

