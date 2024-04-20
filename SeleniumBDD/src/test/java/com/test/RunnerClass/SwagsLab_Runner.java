package com.test.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/Features",
		glue="com.test.Stepdefinitions",
		monochrome=true
		)
public class SwagsLab_Runner {

}
