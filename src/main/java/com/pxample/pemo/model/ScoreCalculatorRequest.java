package com.pxample.pemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ScoreCalculatorRequest {

    private BigInteger idNumber;

    private String name;

    private String surname;

    private String phoneNumber;

    private Integer cityCode;

}
