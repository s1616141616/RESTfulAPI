package com.api.restful.tests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.api.restful.client.RestClient;
import com.api.restful.main.TestMain;

public class GetAPITest extends TestMain {

	TestMain testMain;
	
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restClient;
	
	@BeforeMethod
	public void setUP() throws IOException, Exception {
		testMain = new TestMain();
		
	serviceUrl = prop.getProperty("URL");
	apiUrl =prop.getProperty("serviceURL");
		
	url = serviceUrl + apiUrl;
	}
	
	
	@Test
	public void getTest() throws Exception, Exception {
		restClient = new RestClient();
		restClient.get(url);
		
		
	}
}