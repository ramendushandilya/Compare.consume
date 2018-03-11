package com.lemputy.compare.consume.flipkart.fetchExternal.apis.impl;

import com.lemputy.compare.consume.flipkart.fetchExternal.apis.IGenerateLinksService;
import com.lemputy.compare.consume.flipkart.fetchExternal.apis.IGetProductsService;
import com.lemputy.compare.consume.flipkart.fetchExternal.enums.CategoryMatcher;
import com.lemputy.compare.consume.flipkart.fetchExternal.models.airConditioners.AirConditionersExtApi;
import com.lemputy.compare.consume.flipkart.utils.IPrepareHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Service
public class GetProductsImpl implements IGetProductsService{

    @Autowired
    private IGenerateLinksService linksService;

    @Autowired
    private IPrepareHeaderService headerService;

    List<AirConditionersExtApi> airConditioners = new LinkedList<>();

    @Override
    public List<AirConditionersExtApi> getAllAcs() {
        Map<String, String > linksMap = linksService.getProductCategoryUrls();
        AirConditionersExtApi airConditioners = new AirConditionersExtApi();
        String url = null;

        if(linksMap.containsKey(CategoryMatcher.AIRCONDITIONER.toString())) {
           url = linksMap.get(CategoryMatcher.AIRCONDITIONER.toString());
        }
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders header = headerService.prepareHeader();
        HttpEntity<String> entity = new HttpEntity<String>("parameters", header);
        ResponseEntity<AirConditionersExtApi> acs = restTemplate.exchange(url, HttpMethod.GET, entity, AirConditionersExtApi.class);

        if(acs.getStatusCodeValue() != 200) {
            System.out.println("Failed");
        } else {
            //Success passed as per current code
            //Add Ac object to List
            //works fine for deeply nested jsons as well
            //Iterate over the list to produce all list
        }

        return null;
    }
}