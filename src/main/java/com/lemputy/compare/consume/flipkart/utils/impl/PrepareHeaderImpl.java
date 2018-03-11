package com.lemputy.compare.consume.flipkart.utils.impl;

import com.lemputy.compare.consume.flipkart.utils.IPrepareHeaderService;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public class PrepareHeaderImpl implements IPrepareHeaderService{

    @Override
    public HttpHeaders prepareHeader() {
        HttpHeaders header = new HttpHeaders();
        header.add("Fk-Affiliate-Id", "ramendu98");
        header.add("Fk-Affiliate-Token", "acbfa63280704742bdcb1c3d30de0b9e");
        return header;
    }
}
