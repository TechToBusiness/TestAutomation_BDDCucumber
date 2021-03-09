package com.cucumbertest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/feature"
        ,glue = {"com/stepdefinitions"}
        , plugin= {"pretty", "html:target/cucumber-reports/hh1.html", "json:target/cucumber-reports/js1.json"}
        , tags = "@login or @linkvalidation"
        , monochrome = true)

public class TestRunner {

}


//        features = "src/main/resources/feature"  -- Speicifies location of feature folder
//                ,glue = {"com/stepdefinitions"}  -- Specifies location of step definitions
//        ,plugin = {"pretty"}  -- Specifies plugin like pretty  which are used to generate reports
//                ,tags = "@smokelevel1")  - specifies runnning feature as per tags
