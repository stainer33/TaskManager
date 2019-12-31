package com.e.taskmanager.API;

import com.e.taskmanager.Model.User;
import com.e.taskmanager.ServerResponse.ImageResponse;
import com.e.taskmanager.ServerResponse.UserResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UserAPI {

    @POST("users/signup")
    Call<UserResponse>signUp(@Body User user);

    @FormUrlEncoded
    @POST("users/login")
    Call<UserResponse>login(@Field("username")String username,@Field("password") String password);

    @Multipart
    @POST("upload")
    Call<ImageResponse>uploadImage(@Part MultipartBody.Part img);

}
