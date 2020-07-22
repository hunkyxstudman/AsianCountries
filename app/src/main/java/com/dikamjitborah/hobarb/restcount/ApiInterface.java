package com.dikamjitborah.hobarb.restcount;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/rest/v2/regionalbloc/eu")
    Call<List<Todo>> getEU();

    @GET("/rest/v2/regionalbloc/pa")
    Call<List<Todo>> getPA();

    @GET("/rest/v2/regionalbloc/SAARC")
    Call<List<Todo>> getSAARC();


}
