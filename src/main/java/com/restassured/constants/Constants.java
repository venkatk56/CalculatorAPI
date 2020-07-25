package com.restassured.constants;

public class Constants {
	
	private Constants() {
		
	}

	public static final String EXCELPATH = System.getProperty("user.dir")+"/src/test/resources/testdata.xls";
	public static final String TESTDATASHEETNAME = "TestData";
	public static final String EXTENTREPORTPATH = System.getProperty("user.dir")+"/ExtentReports/index.html";
	
	public static final String EXTENTCONFIGFILEPATH = System.getProperty("user.dir")
			+"/src/test/resources/extentreport.xml";
	
	public static final String RESPONSETXTPATH="./output/responses/";
	
	public static final String RUNMANAGERSHEET= "RUNMANAGER";
	public static final String JSONSLOCATION=System.getProperty("user.dir")+"/src/test/resources/jsons";
	public static final String BASEURL = "http://test.i-pay.co.za";
	public static final String USERNAME ="";
	public static final String CLIENT_SECRET="";
	public static final String GRANT_TYPE= "";
	public static final String CLIENT_ID= "";
	public static final String PASSWORD= "";
	public static final String FSI_LANGUAGE="";

	//Endpoints
	public static final String COUNTRYDETAILSBYNAME_ENDPOINT = "/qa/calculator/{operation}/{number1}/{number2}";
	public static final String AUTH_ENDPOINT = "";
	
	//Request xml paths
	public static final String REQUEST_JSON_FOLDER_PATH =  System.getProperty("user.dir")+
			"/src/test/resources/jsonsforrequestbody/";


}
