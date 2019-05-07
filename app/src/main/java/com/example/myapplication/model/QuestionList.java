package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QuestionList {
    @SerializedName("items")
    private final List<Question> mQuestions;

    public QuestionList(List<Question> questions) {
        mQuestions = questions;
    }
    public List<Question> getQuestions() {
        return mQuestions;
    }
}
