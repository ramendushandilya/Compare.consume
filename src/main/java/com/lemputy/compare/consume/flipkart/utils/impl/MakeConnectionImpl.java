package com.lemputy.compare.consume.flipkart.utils.impl;

import com.lemputy.compare.consume.flipkart.utils.IMakeConnectionService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class MakeConnectionImpl implements IMakeConnectionService {

    @Override
    public HttpURLConnection connectToEndPoint(String url) {
        HttpURLConnection connection = null;
        try {
            URL streamUrl = new URL(url);
            connection = (HttpURLConnection) streamUrl.openConnection();
            connection.setRequestMethod("GET");

            if(connection.getResponseCode() != 200) {
                throw new RuntimeException("Failed! HTTP Error code : "+connection.getResponseCode());
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return connection;
    }
}