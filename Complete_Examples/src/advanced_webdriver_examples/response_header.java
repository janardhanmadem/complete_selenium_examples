package advanced_webdriver_examples;

import org.apache.http.client.fluent.Request;

public class response_header {
	public static void main(String args[]){
		String url="https://mail.google.com";
		try{
			int resp_code=Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
			System.out.println(resp_code);
		}catch(Exception e){
			System.out.println("error messge :"+e.getMessage());
			e.getStackTrace();
		}
		
	}

}
