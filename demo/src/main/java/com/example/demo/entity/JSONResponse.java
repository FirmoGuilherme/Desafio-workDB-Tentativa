package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class JSONResponse {
    public final String cidade;

    public JSONResponse(@JsonProperty("cidade") String cidade){
        this.cidade = cidade;
    }
}
