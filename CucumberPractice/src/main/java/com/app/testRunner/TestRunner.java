package com.app.testRunner;


import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
		features = "Features"
		,glue={"stepDefinition"}
		)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {

}