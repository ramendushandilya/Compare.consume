package com.lemputy.compare.consume.flipkart.apis.impl;

import com.google.gson.Gson;
import com.lemputy.compare.consume.flipkart.apis.IGenerateLinksService;
import com.lemputy.compare.consume.flipkart.models.productFeed.ApiListings;
import com.lemputy.compare.consume.flipkart.models.productFeed.ProductFeed;
import com.lemputy.compare.consume.flipkart.utils.MakeConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.*;

public class GenerateLinkService implements IGenerateLinksService {

    private static final String AFFILIATE_ID_KEY = "Fk-Affiliate-Id";
    private static final String AFFILIATE_ID_VALUE = "ramendu98";
    private static final String AFFILIATE_TOKEN_KEY = "Fk-Affiliate-Token";
    private static final String AFFILIATE_TOKEN_VALUE = "acbfa63280704742bdcb1c3d30de0b9e";

    MakeConnection connect = new MakeConnection();

    @Override
    public Map<String, String> getProductCategoryUrls() {
        String url = "https://affiliate-api.flipkart.net/affiliate/api/ramendu98.json";
        url += "?/"+AFFILIATE_ID_KEY+"="+AFFILIATE_ID_VALUE+"&"+AFFILIATE_TOKEN_KEY+"="+AFFILIATE_TOKEN_VALUE;
        ProductFeed productFeed = new ProductFeed();
        try {
            HttpURLConnection connection = connect.connectToEndPoint(url);
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            Gson gson = new Gson();
            String output;
            while ((output = reader.readLine()) != null) {
                productFeed = gson.fromJson(output, ProductFeed.class);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ApiListings listings = productFeed.getApiGroups().getAffiliate().getApiListings();

        Map<String, String > prodcutCategory = new HashMap<>();

        List<Field> declaredCategories = new ArrayList<>();

        List<String> categories = new ArrayList<>();

        Field[] fields = ApiListings.class.getDeclaredFields();

        for(Field field : fields) {
            if(Modifier.isPrivate(field.getModifiers())) {
                declaredCategories.add(field);
            }
        }

        for(Field field : declaredCategories) {
            String[] str = field.toString().split("[\\s\\.]+");
            categories.add(str[str.length-1]);
        }

        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirCoolers", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AudioPlayers", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Automotive", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("BabyCare", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("BagsWalletsBelts", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("CameraAccessories", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Cameras", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("ComputerComponents", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("ComputerPeripherals", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("ComputerStorage", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Desktops", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("ELearning", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Eyewear", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("FoodNutrition", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Fragrances", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Furniture", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AirConditioners", listings.getAirConditioners().getAvailableVariants().getV110().getGet());


        //prepare the mapping

        prodcutCategory.put(categories.get(0),listings.getAirConditioners().getAvailableVariants().getV110().getGet());
        prodcutCategory.put(categories.get(1),listings.getAirCoolers().getAvailableVariants().getV110().getGet());
        prodcutCategory.put(categories.get(2),listings.getAudioPlayers().getAvailableVariants().getV110().getGet());
        prodcutCategory.put(categories.get(3),listings.getAutomotive().getAvailableVariants().getV110().getGet());
        prodcutCategory.put(categories.get(4),listings.getBabyCare().getAvailableVariants().getV110().getGet());
        prodcutCategory.put(categories.get(5),listings.getBagsWalletsBelts().getAvailableVariants().getV110().getGet());
        prodcutCategory.put(categories.get(6),listings.getCameraAccessories().getAvailableVariants().getV110().getGet());


        Iterator it = prodcutCategory.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey()+"->"+pair.getValue());
        }

        return prodcutCategory;
    }
}