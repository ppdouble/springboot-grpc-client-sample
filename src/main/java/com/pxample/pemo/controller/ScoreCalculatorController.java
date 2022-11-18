package com.pxample.pemo.controller;

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

    @GetMapping("/cal-score")
    public BigInteger calculateCityScore(@RequestParam Map<String, Object> scoreCalculatorParaMap) {

        System.out.println(scoreCalculatorParaMap.values());
        ObjectMapper objectMapper = new ObjectMapper();
        ScoreCalculatorService scoreCalculatorService = new ScoreCalculatorServiceImpl();

        ScoreCalculatorRequest scoreCalculatorRequest = objectMapper.convertValue(scoreCalculatorParaMap, ScoreCalculatorRequest.class);

        return scoreCalculatorService.calculateScore(scoreCalculatorRequest);

    }
}
