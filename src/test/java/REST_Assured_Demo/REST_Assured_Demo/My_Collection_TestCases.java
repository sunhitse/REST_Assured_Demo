package REST_Assured_Demo.REST_Assured_Demo;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class My_Collection_TestCases {
	
	@Test(priority=0)
	  public void post() 
	  {
	   //Specify base URI                 
		RestAssured.baseURI="https://reqres.in/api/users";
	                  
	//Request object(whenever you want to send request to the server)
	  RequestSpecification httpRequest=RestAssured.given();
	                  
	 //Request payload sending along with post request
	  JSONObject requestParams=new JSONObject();
	                  
	 requestParams.put("name","pavan");
	 requestParams.put("job","trainer");
	 
	                
	                  
	httpRequest.header("Content-Type","application/json");
	                  
	//httpRequest.body(requestParams.toString());                       
	 // attach above data to the request
	                   
	 //Response object
	 Response response=httpRequest.request(Method.POST);
	                  
	 //print response in console window
	                  
	  String responseBody=response.getBody().asString();
	 System.out.println("Response Body is:"+responseBody);
	                  
	 //status code validation
	 int statusCode=response.getStatusCode();
	  System.out.println("Status code is: "+statusCode);
	 Assert.assertEquals(statusCode, 201);    
	                 
	                 }
	
	@Test(description="Without Payload",priority=4)
	  public void post1() 
	  {
	   //Specify base URI                 
		RestAssured.baseURI="https://reqres.in/api/users";
	                  
	//Request object(whenever you want to send request to the server)
	  RequestSpecification httpRequest=RestAssured.given();
	                  
	 //Request payload sending along with post request
	  JSONObject requestParams=new JSONObject();
	                  
	// requestParams.put("name","pavan");
	// requestParams.put("job","trainer");
	 
	                
	                  
	httpRequest.header("Content-Type","application/json");
	                  
	//httpRequest.body(requestParams.toString());                       
	 // attach above data to the request
	                   
	 //Response object
	 Response response=httpRequest.request(Method.POST);
	                  
	 //print response in console window
	                  
	  String responseBody=response.getBody().asString();
	 System.out.println("Response Body is: Enter The Request Body"+responseBody);
	                  
	 //status code validation
	 int statusCode=response.getStatusCode();
	  System.out.println("Status code is: "+statusCode);
	 Assert.assertEquals(statusCode, 404);    
	                 
	                 }
	
	@Test(priority=1)
	  public void get() 
	  {
	   //Specify base URI            
	   RestAssured.baseURI="https://reqres.in/api/users?page=2";
	                  
	 //Request object
	    RequestSpecification httpRequest=RestAssured.given();
	                  
	   //Response object
	 Response response=httpRequest.request(Method.GET);
	                  
	  //print response in console window
	                  
	  String responseBody=response.getBody().asString();
	   System.out.println("Response Body is:" +responseBody);
	                  
	//status code validation
	int statusCode=response.getStatusCode();

	 System.out.println("Status code is: "+statusCode);
	   Assert.assertEquals(statusCode, 200);
	                  
	//status line verification
	  String statusLine=response.getStatusLine();
	  System.out.println("Status line is:"+statusLine);
	  Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");

	  }
	
	@Test(description="Without User Data",priority=5)
	  public void get1() 
	  {
	   //Specify base URI            
	   RestAssured.baseURI="https://reqres.in/api/";
	                  
	 //Request object
	    RequestSpecification httpRequest=RestAssured.given();
	                  
	   //Response object
	 Response response=httpRequest.request(Method.GET);
	                  
	  //print response in console window
	                  
	  String responseBody=response.getBody().asString();
	   System.out.println("Response Body is: Enter User Details" +responseBody);
	                  
	//status code validation
	int statusCode=response.getStatusCode();

	 System.out.println("Status code is: "+statusCode);
	   Assert.assertEquals(statusCode, 404);
	                  
	//status line verification
	 // String statusLine=response.getStatusLine();
	 // System.out.println("Status line is:"+statusLine);
	 // Assert.assertEquals(statusLine, "HTTP/1.1 404");

	  }
	
	@Test(priority=2)
	  public void put() 
	  {
	   //Specify base URI                 
		RestAssured.baseURI="https://reqres.in/api/users/527";
	                  
	//Request object(whenever you want to send request to the server)
	  RequestSpecification httpRequest=RestAssured.given();
	                  
	 //Request payload sending along with post request
	  JSONObject requestParams=new JSONObject();
	                  
	 requestParams.put("name","pavan");
	 requestParams.put("job","Hero");
	 
	                
	                  
	httpRequest.header("Content-Type","application/json");
	                  
	//httpRequest.body(requestParams.toString());                       
	 // attach above data to the request
	                   
	 //Response object
	 Response response=httpRequest.request(Method.PUT);
	                  
	 //print response in console window
	                  
	  String responseBody=response.getBody().asString();
	 System.out.println("Response Body is:"+responseBody);
	                  
	 //status code validation
	 int statusCode=response.getStatusCode();
	  System.out.println("Status code is: "+statusCode);
	 Assert.assertEquals(statusCode, 200);    
	                 
	                 }
	
	
	@Test(description="Without passing Payload",priority=6)
	  public void put1() 
	  {
	   //Specify base URI                 
		RestAssured.baseURI="https://reqres.in/api/users/527";
	                  
	//Request object(whenever you want to send request to the server)
	  RequestSpecification httpRequest=RestAssured.given();
	                  
	 //Request payload sending along with post request
	  JSONObject requestParams=new JSONObject();
	                  
	// requestParams.put("name","pavan");
	 //requestParams.put("job","Hero");
	 
	                
	                  
	httpRequest.header("Content-Type","application/json");
	                  
	//httpRequest.body(requestParams.toString());                       
	 // attach above data to the request
	                   
	 //Response object
	 Response response=httpRequest.request(Method.PUT);
	                  
	 //print response in console window
	                  
	  String responseBody=response.getBody().asString();
	 System.out.println("Response Body is: Add Request Body"+responseBody);
	                  
	 //status code validation
	 int statusCode=response.getStatusCode();
	  System.out.println("Status code is: "+statusCode);
	 Assert.assertEquals(statusCode, 400);    
	                 
	                 }
	@Test(priority=3)
	  public void delete() 
	  {
	   //Specify base URI
	   RestAssured.baseURI="https://reqres.in/api/users/527";
	              
	   //Request object
	   RequestSpecification httpRequest=RestAssured.given();
	              
	  
	   //print response in console window//Request payload sending along with post request
	 JSONObject requestParams=new JSONObject();
	              
	  requestParams.put("id",527);
	                          
	   httpRequest.header("Content-Type","application/json");
	              
	  httpRequest.body(requestParams.toString()); // attach above data to the request
	               
	   //Response object
	   Response response=httpRequest.request(Method.DELETE);
	              
	   String responseBody=response.getBody().asString();
	   System.out.println("Response Body is:Data Successfully Deleted" +responseBody);
	              
	  //status code validation
	   int statusCode=response.getStatusCode();
	   System.out.println("Status code is: "+statusCode);
	   Assert.assertEquals(statusCode, 204);         
	  }
	@Test(description="Without ID",priority=7)
	  public void delete1() 
	  {
	   //Specify base URI
	   RestAssured.baseURI="https://reqres.in/api/users";
	              
	   //Request object
	   RequestSpecification httpRequest=RestAssured.given();
	              
	  
	   //print response in console window//Request payload sending along with post request
	 JSONObject requestParams=new JSONObject();
	              
	  requestParams.put("id"," ");
	                          
	   httpRequest.header("Content-Type","application/json");
	              
	  httpRequest.body(requestParams.toString()); // attach above data to the request
	               
	   //Response object
	   Response response=httpRequest.request(Method.DELETE);
	              
	   String responseBody=response.getBody().asString();
	   System.out.println("Response Body is: Need to Add ID" +responseBody);
	              
	  //status code validation
	   int statusCode=response.getStatusCode();
	   System.out.println("Status code is: "+statusCode);
	   Assert.assertEquals(statusCode, 204);         
	  }

}
