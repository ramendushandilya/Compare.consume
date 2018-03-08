package com.lemputy.compare.consume.flipkart.utils;

import java.net.HttpURLConnection;

public interface IMakeConnection {

    HttpURLConnection connectToEndPoint(String url);

}
