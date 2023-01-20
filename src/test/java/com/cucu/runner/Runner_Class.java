package com.cucu.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.base.cucu.Base_Cucu;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactine.feature",

glue="com.step.defenition",
monochrome = true,
dryRun = false,
publish = true,
plugin = {"html:Report/rep.html",
"pretty"})

public class Runner_Class {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void start() {
		
		driver = Base_Cucu.browser_launch("chrome");

	}
	

}
