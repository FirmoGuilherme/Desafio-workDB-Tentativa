package com.example.demo.controller;

import com.example.demo.entity.JSONResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.time.Duration;

public class ConectOpenWeatherAPI  {

    public static void  retornaAPI()throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();


        CloseableHttpClient http = HttpClients.createDefault();
        HttpGet getRequest = new HttpGet("https://localhost:8080/previsao");
        JSONResponse response = http.execute(getRequest,httpResponse -> objectMapper.readValue(httpResponse.getEntity().getContent(),JSONResponse.class));
        System.out.println(response.cidade);

    }

}
