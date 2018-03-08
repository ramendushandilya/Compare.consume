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
        prodcutCategory.put("AirCoolers", listings.getAirCoolers().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("AudioPlayers", listings.getAudioPlayers().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Automotive", listings.getAutomotive().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("BabyCare", listings.getBabyCare().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("BagsWalletsBelts", listings.getBagsWalletsBelts().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("CameraAccessories", listings.getCameraAccessories().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Cameras", listings.getCameras().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("ComputerComponents", listings.getComputerComponents().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("ComputerPeripherals", listings.getComputerPeripherals().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("ComputerStorage", listings.getComputerStorage().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Desktops", listings.getDesktops().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("ELearning", listings.getELearning().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Eyewear", listings.getEyewear().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("FoodNutrition", listings.getFoodNutrition().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Fragrances", listings.getFragrances().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Furniture", listings.getFurniture().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Gaming", listings.getGaming().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("GroomingBeautyWellness", listings.getGroomingBeautyWellness().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("HomeAndKitchenNeeds", listings.getHomeAndKitchenNeeds().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("HomeAppliances", listings.getHomeAppliances().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("HomeDecorAndFestiveNeeds", listings.getHomeDecorAndFestiveNeeds().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("HomeEntertainment", listings.getHomeEntertainment().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("HomeFurnishing", listings.getHomeFurnishing().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("HomeImprovementTools", listings.getHomeImprovementTools().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("HouseholdSupplies", listings.getHouseholdSupplies().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Jewellery", listings.getJewellery().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("KidsClothing", listings.getKidsClothing().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("KidsFootwear", listings.getKidsFootwear().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("KitchenAppliances", listings.getKitchenAppliances().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("LandlinePhones", listings.getLandlinePhones().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("LaptopAccessories", listings.getLaptopAccessories().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Laptops", listings.getLaptops().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("LuggageTravel", listings.getLuggageTravel().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("MensClothing", listings.getMensClothing().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("MensFootwear", listings.getMensFootwear().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("MicrowaveOvens", listings.getMicrowaveOvens().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("MobileAccessories", listings.getMobileAccessories().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Mobiles", listings.getMobiles().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("MusicMoviesPosters", listings.getMusicMoviesPosters().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("NetworkComponents", listings.getNetworkComponents().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("PetSupplies", listings.getPetSupplies().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Refrigerator", listings.getRefrigerator().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Software", listings.getSoftware().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("SportsFitness", listings.getSportsFitness().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("StationeryOfficeSupplies", listings.getStationeryOfficeSupplies().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Sunglasses", listings.getSunglasses().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("TabletAccessories", listings.getTabletAccessories().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Tablets", listings.getTablets().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Televisions", listings.getTelevisions().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Toys", listings.getToys().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("TvVideoAccessories", listings.getTvVideoAccessories().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("VideoPlayers", listings.getVideoPlayers().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("WashingMachine", listings.getWashingMachine().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("Watches", listings.getWatches().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("WearableSmartDevices", listings.getWearableSmartDevices().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("WomensClothing", listings.getWomensClothing().getAvailableVariants().getV110().getGet());
        prodcutCategory.put("WomensFootwear", listings.getWomensFootwear().getAvailableVariants().getV110().getGet());

        return prodcutCategory;
    }
}