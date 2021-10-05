package com.testing;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/feature/ApplicationLogin" ,
        glue = "com.stepdefinitions"
)
public class RunCukesTest {
}

