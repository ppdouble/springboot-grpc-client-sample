package com.pxample.pemo.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.pxample.pemo.model.ScoreCalculatorRequest;
import com.pxample.pemo.service.ScoreCalculatorService;
import com.pxample.pemo.service.impl.ScoreCalculatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigInteger;
import java.util.Map;

@RestController
public class ScoreCalculatorController {

    @Autowired
    ScoreCalculatorService scoreCalculatorService;

    @Autowired
    ObjectMapper objectMapper;

    @GetMapping("/cal-score")
    public String calculateCityScore(@RequestParam Map<String, Object> scoreCalculatorParaMap) {

        System.out.println(scoreCalculatorParaMap.values());
        ScoreCalculatorRequest scoreCalculatorRequest = objectMapper.convertValue(scoreCalculatorParaMap, ScoreCalculatorRequest.class);

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("city_score", scoreCalculatorService.calculateScore(scoreCalculatorRequest));
        System.out.println(jsonObject);
        return jsonObject.toString();
    }
}
