package REST_Assured_Demo.REST_Assured_Demo;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Http_Method_Test_Cases1 {
	
	@Test
	  public void get() 
	  {
	   //Specify base URI            
	   RestAssured.baseURI="https://dummy.restapiexample.com/api/v1/employees";
	                  
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
	@Test
	  public void post() 
	  {
	   //Specify base URI                  
		RestAssured.baseURI="https://reqres.in/api/userspage=2";
	                  
	//Request object(whenever you want to send request to the server)
	  RequestSpecification httpRequest=RestAssured.given();
	                  
	 //Request payload sending along with post request
	  JSONObject requestParams=new JSONObject();
	                  
	 requestParams.put("id",15);
	 requestParams.put("email","virat@reqres.in");
	 requestParams.put("first_name","Virat");
	 requestParams.put("last_name","Kohli");        
	// requestParams.put("avatar","https://reqres.in/img/faces/7-image.jpg");
	                
	                  
	httpRequest.header("Content-Type","application/json");
	                  
	httpRequest.body(requestParams.toString());                       
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
	
	@Test
	  public void delete() 
	  {
	   //Specify base URI
	   RestAssured.baseURI="https://reqres.in/api/users?page=2";
	              
	   //Request object
	   RequestSpecification httpRequest=RestAssured.given();
	              
	  
	   //print response in console window//Request payload sending along with post request
	 JSONObject requestParams=new JSONObject();
	              
	  requestParams.put("id",15);
	                          
	   httpRequest.header("Content-Type","application/json");
	              
	  httpRequest.body(requestParams.toString()); // attach above data to the request
	               
	   //Response object
	   Response response=httpRequest.request(Method.DELETE);
	              
	   String responseBody=response.getBody().asString();
	   System.out.println("Response Body is:" +responseBody);
	              
	  //status code validation
	   int statusCode=response.getStatusCode();
	   System.out.println("Status code is: "+statusCode);
	   Assert.assertEquals(statusCode, 204);         
	  }
}
