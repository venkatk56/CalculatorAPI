package com.restassured.testcases;

import com.google.common.io.Files;
import com.restassured.constants.Constants;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;


public class CalculatorTest extends BaseTest{

	

	/*
	 * There should be a test case matching this test name in RUNMANAGER and TESTDATA sheet
	 * If there are multiple data lines in TESTDATA sheet, it will treated as iteration
	 * Mark Yes in RUNMANAGER and TESTDATA to run this test case
	 */
	
	
	@Test
	public void Addition_getValuesforNumbers(Hashtable<String, String> data) throws IOException {
		/*
		 * Replacing the name parameter in the endpoint with the data from excel sheet.
		 * Data providers return a hastable and the column name is used as a key to get the value
		 */
		String endpointPath = ((Constants.COUNTRYDETAILSBYNAME_ENDPOINT.replace("{operation}", data.get("operation")).replace("{number1}", data.get("number1"))).replace("{number2}", data.get("number2")));
		Response response = given()
				.header("APIKEY","123ABC")
				.when()
				.filter(new RequestLoggingFilter(captor)) //This line is mandatory to log the request details to extent report
				.log()
				.all()
				.get (Constants.BASEURL+endpointPath).then().
						extract().response();
		/*
		 * Writing the request and response to extent report
		 *  
		 */
		writeRequestAndResponseInReport(writer.toString(), response.prettyPrint(), data.get("TestCaseDescription"));
		int expectedOutputVal;
		int actualOutputValue ;
		if (data.get("TestCaseDescription").equals("AboveCutoffValues")) {
			//Expected value is from TESTDATA sheet and column expectedCountryCapital
			assertEquals(response.jsonPath().get("error"), data.get("outputValue") );
		} else {
			expectedOutputVal = Integer.valueOf(data.get("outputValue"));
			actualOutputValue = response.jsonPath().get("answer");
			//Expected value is from TESTDATA sheet and column expectedCountryCapital
			assertEquals(actualOutputValue, expectedOutputVal );
		}

		//Writing the response to an log file
		Files.write(response.asByteArray(),
				new File(Constants.RESPONSETXTPATH+data.get("TestCaseName")+data.get("Test Case Description")+".txt"));
		
	}
	@Test
	public void Subtraction_getValuesforNumbers(Hashtable<String, String> data) throws IOException {
		/*
		 * Replacing the name parameter in the endpoint with the data from excel sheet.
		 * Data providers return a hastable and the column name is used as a key to get the value
		 */
		String endpointPath = ((Constants.COUNTRYDETAILSBYNAME_ENDPOINT.replace("{operation}", data.get("operation")).replace("{number1}", data.get("number1"))).replace("{number2}", data.get("number2")));
		Response response = given()
				.header("APIKEY","123ABC")
				.when()
				.filter(new RequestLoggingFilter(captor)) //This line is mandatory to log the request details to extent report
				.log()
				.all()
				.get (Constants.BASEURL+endpointPath).then().
						extract().response();
		/*
		 * Writing the request and response to extent report
		 *
		 */
		writeRequestAndResponseInReport(writer.toString(), response.prettyPrint(), data.get("TestCaseDescription"));
		int expectedOutputVal;
		int actualOutputValue ;
		if (data.get("TestCaseDescription").equals("AboveCutoffValues")) {
			//Expected value is from TESTDATA sheet and column expectedCountryCapital
			assertEquals(response.jsonPath().get("error"), data.get("outputValue") );
		} else {
			expectedOutputVal = Integer.valueOf(data.get("outputValue"));
			actualOutputValue = response.jsonPath().get("answer");
			//Expected value is from TESTDATA sheet and column expectedCountryCapital
			assertEquals(actualOutputValue, expectedOutputVal );
		}

		//Writing the response to an log file
		Files.write(response.asByteArray(),
				new File(Constants.RESPONSETXTPATH+data.get("TestCaseName")+data.get("Test Case Description")+".txt"));

	}
	@Test
	public void Multiplication_getValuesforNumbers(Hashtable<String, String> data) throws IOException {
		/*
		 * Replacing the name parameter in the endpoint with the data from excel sheet.
		 * Data providers return a hastable and the column name is used as a key to get the value
		 */
		String endpointPath = ((Constants.COUNTRYDETAILSBYNAME_ENDPOINT.replace("{operation}", data.get("operation")).replace("{number1}", data.get("number1"))).replace("{number2}", data.get("number2")));
		Response response = given()
				.header("APIKEY","123ABC")
				.when()
				.filter(new RequestLoggingFilter(captor)) //This line is mandatory to log the request details to extent report
				.log()
				.all()
				.get (Constants.BASEURL+endpointPath).then().
						extract().response();

		/*
		 * Writing the request and response to extent report
		 *
		 */
		writeRequestAndResponseInReport(writer.toString(), response.prettyPrint(), data.get("TestCaseDescription"));
		int expectedOutputVal;
		int actualOutputValue ;
		if (data.get("TestCaseDescription").equals("AboveCutoffValues")) {
			//Expected value is from TESTDATA sheet and column expectedCountryCapital
			assertEquals(response.jsonPath().get("error"), data.get("outputValue") );
		} else {
			expectedOutputVal = Integer.valueOf(data.get("outputValue"));
			actualOutputValue = response.jsonPath().get("answer");
			//Expected value is from TESTDATA sheet and column expectedCountryCapital
			assertEquals(actualOutputValue, expectedOutputVal );
		}

		//Writing the response to an log file
		Files.write(response.asByteArray(),
				new File(Constants.RESPONSETXTPATH+data.get("TestCaseName")+data.get("Test Case Description")+".txt"));

	}
	@Test
	public void Divide_getValuesforNumbers(Hashtable<String, String> data) throws IOException {
		/*
		 * Replacing the name parameter in the endpoint with the data from excel sheet.
		 * Data providers return a hastable and the column name is used as a key to get the value
		 */
		String endpointPath = ((Constants.COUNTRYDETAILSBYNAME_ENDPOINT.replace("{operation}", data.get("operation")).replace("{number1}", data.get("number1"))).replace("{number2}", data.get("number2")));
		Response response = given()
				.header("APIKEY","123ABC")
				.when()
				.filter(new RequestLoggingFilter(captor)) //This line is mandatory to log the request details to extent report
				.log()
				.all()
				.get (Constants.BASEURL+endpointPath).then().
						extract().response();
		/*
		 * Writing the request and response to extent report
		 *
		 */
		writeRequestAndResponseInReport(writer.toString(), response.prettyPrint(), data.get("TestCaseDescription"));
		int expectedOutputVal;
		int actualOutputValue ;
		if (data.get("TestCaseDescription").equals("AboveCutoffValues")) {
			//Expected value is from TESTDATA sheet and column expectedCountryCapital
			assertEquals(response.jsonPath().get("error"), data.get("outputValue") );
		} else {
			expectedOutputVal = Integer.valueOf(data.get("outputValue"));
			actualOutputValue = response.jsonPath().get("answer");
			//Expected value is from TESTDATA sheet and column expectedCountryCapital
			assertEquals(actualOutputValue, expectedOutputVal );
		}

		//Writing the response to an log file
		Files.write(response.asByteArray(),
				new File(Constants.RESPONSETXTPATH+data.get("TestCaseName")+data.get("Test Case Description")+".txt"));

	}

}
