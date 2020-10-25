package com.library1.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/library1/step_definitions",
        tags =  "@student_test",
        dryRun = false

)



public class CucumberRunner {}


