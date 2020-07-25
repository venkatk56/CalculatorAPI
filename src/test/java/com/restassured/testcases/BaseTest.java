package com.restassured.testcases;

import static io.restassured.RestAssured.given;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.io.output.WriterOutputStream;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.restassured.constants.Constants;
import com.restassured.reports.ExtentReport;
import com.restassured.reports.LogStatus;
import com.restassured.utils.TestUtils;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BaseTest {
	
	protected StringWriter writer;
	protected PrintStream captor;
	
	
	/*
	 * Initializing the extent report
	 */
	@BeforeSuite
	public void setUpSuite() {
		ExtentReport.initialize();
		
	}

	/*
	 * Flusing the extent report
	 * Opening the extent report automatically after the test suite execution.
	 */
	
	@AfterSuite
	public void afterSuite() throws IOException  {
		ExtentReport.report.flush();
		File htmlFile = new File(Constants.EXTENTREPORTPATH);
		Desktop.getDesktop().browse(htmlFile.toURI());

	}

	/*
	 * This method helps to write the request and reponse to the extent report
	 */
	@BeforeMethod
	public void setUp() {
		
		writer = new StringWriter();
		captor = new PrintStream(new WriterOutputStream(writer), true);
	}



	/*
	 * Format the api string and log in Extent Report
	 * @param  : apicontent
	 */
	protected void formatAPIAndLogInReport(String content) {

		String prettyPrint = content.replace("\n", "<br>");
		LogStatus.info("<pre>" + prettyPrint + "</pre>");

	}


	/*
	 * Read the json file and convert to String
	 * @param  : filepath
	 */
	public String generateStringFromResource(String path) throws IOException {
		String temp="";
		try {
			temp= new String(Files.readAllBytes(Paths.get(path)));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return temp;

	}
	
	public void writeRequestAndResponseInReport(String request,String response, String strTestcaseDescription) {

		LogStatus.info(strTestcaseDescription);
		LogStatus.info("---- Request ---");
		formatAPIAndLogInReport(request);
		LogStatus.info("---- Response ---");
		formatAPIAndLogInReport(response);
	}
	
}
