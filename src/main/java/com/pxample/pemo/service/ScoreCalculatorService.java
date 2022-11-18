package com.pxample.pemo.service;


import com.pxample.api.CityScore;
import com.pxample.api.cityscoreGrpc;
import com.pxample.pemo.model.ScoreCalculatorRequest;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

public interface ScoreCalculatorService {

    BigInteger calculateScore (ScoreCalculatorRequest scoreCalculatorRequest);

}
