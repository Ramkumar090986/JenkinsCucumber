package org.runner;

import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"D:\\eclipse-workspace\\JenkinsFacebook\\src\\test\\resources\\Login.feature"}, glue= {"org.step"}, monochrome=true, dryRun=false,
plugin= {"pretty","html:D:\\eclipse-workspace\\JenkinsFacebook\\src\\test\\resource",
		"junit:D:\\eclipse-workspace\\JenkinsFacebook\\src\\test\\resources\\JVMReport\\report.xml",
		 "json:D:\\eclipse-workspace\\JenkinsFacebook\\src\\test\\resources\\JVMReport\\fb.json"})

public class TestRunner {
@AfterClass
public static void afterClass() {
	JVMReport.generateReport("D:\\eclipse-workspace\\JenkinsFacebook\\src\\test\\resources\\JVMReport\\fb.json");

}
}
