package com.example.myapplication.networking;

import com.example.myapplication.common.Constants;
import com.example.myapplication.model.QuestionList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface QuestionsAPI {
    @GET("/questions?key=" + Constants.STACKOVERFLOW_API_KEY + "&sort=activity&order=desc&site=stackoverflow&filter=withbody")
    Call<QuestionList> fetchLastActiveQuestions(@Query("pagesize") Integer pageSize);

}