package com.aakib78.algojichatapp.Fragments;

import com.aakib78.algojichatapp.Notifications.MyResponse;
import com.aakib78.algojichatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA_8EYXks:APA91bHcDjZCXOtU5KyZ0PFhxVbLkgTawTNx_ar0NrZk9jvPAf-xuvV0o1hQOSTp1Hg8ihnLNcl0UV9YhWxwGml66VZT-mOn7Itw612kXiJUYeIrlPXWhafIh562GQW_E5Uf8x_vGNpr"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}