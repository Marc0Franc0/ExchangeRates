package com.app.ExchangeRates.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.json.JSONArray;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExchangesServiceImpl implements ExchangesService{

    @Override
    public List<Object> getValuesOfDolar() throws Exception{
    URL url = new URL( "https://www.dolarsi.com/api/api.php?type=valoresprincipales");
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");

    InputStream stream = connection.getInputStream();
    byte[] arrStream = stream.readAllBytes();

    String contentJson = "";
    for(byte temp:arrStream){
        contentJson+=(char)temp;
    }
       JSONArray json = new JSONArray(contentJson);
        List<Object> list = new ArrayList<>();
    for(Object obj:json){
        System.out.println((((JSONObject) obj).get("casa")));
        list.add(((JSONObject) obj).get("casa"));
    }
    return list;
    }

}
