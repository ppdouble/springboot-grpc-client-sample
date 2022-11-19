package com.pxample.pemo.service.impl;

import com.pxample.api.CityScore.CityScoreRequest;
import com.pxample.api.CityScore.CityScoreResponse;
import com.pxample.api.cityscoreGrpc;
import com.pxample.pemo.model.ScoreCalculatorRequest;
import com.pxample.pemo.service.ScoreCalculatorService;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class ScoreCalculatorServiceImpl implements ScoreCalculatorService {

    //Example: @GrpcClient("myClient") <-> grpc.client.myClient.address=static://localhost:9090
    @GrpcClient("cityscoreclient")
    private cityscoreGrpc.cityscoreBlockingStub citysScoreStub;

    @Override
    public BigInteger calculateScore (ScoreCalculatorRequest scoreCalculatorRequest) {

        Integer cityScore = getCityScore(scoreCalculatorRequest.getCityCode());
        return BigInteger.valueOf(cityScore.intValue());
    }

    private Integer getCityScore(Integer cityCode) {
        // build request
        CityScoreRequest cityScoreRequest
                = CityScoreRequest.newBuilder()
                .setCityCode(cityCode)
                .build();

        try {
            System.out.println(cityScoreRequest.getCityCode());
            // sending request and get response
            CityScoreResponse cityScoreResponse = citysScoreStub.calculateCityScore(cityScoreRequest);
            System.out.println(cityScoreResponse.getCityScore());
            // resolve response and return value
            return cityScoreResponse.getCityScore();
        } catch (StatusRuntimeException e) {
            System.out.println("Get reqponse failure ");
            System.out.println("Exception: " + e.getClass().getName());
            System.out.println("Exception Message: " + e.getMessage());
            System.out.println("Exception Cause: " + e.getCause());
            System.out.println("Exception Stack Trace: ");
            e.printStackTrace();
        }
        return Integer.valueOf(1);
    }
}
