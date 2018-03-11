package com.lemputy.compare.consume.flipkart.fetchExternal.apis;

import com.lemputy.compare.consume.flipkart.fetchExternal.models.airConditioners.AirConditionersExtApi;

import java.util.List;

public interface IGetProductsService {

    List<AirConditionersExtApi> getAllAcs();

}