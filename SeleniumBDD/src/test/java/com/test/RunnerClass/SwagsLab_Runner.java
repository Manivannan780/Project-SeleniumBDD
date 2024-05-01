package com.test.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/Features/ProductsPage.feature",
		glue="com.test.Stepdefinitions",
		//dryRun=true,
		monochrome=true,
		tags="@Smoke"
		)
public class SwagsLab_Runner {

}
