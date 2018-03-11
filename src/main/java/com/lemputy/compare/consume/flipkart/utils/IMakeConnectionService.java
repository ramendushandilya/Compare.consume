package com.lemputy.compare.consume.flipkart.utils;

import java.net.HttpURLConnection;

public interface IMakeConnectionService {

    HttpURLConnection connectToEndPoint(String url);

}
