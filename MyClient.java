package model;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class MyClient {
	
	public static void main(String[] args)
	{
		ClientConfig cc=new DefaultClientConfig();
		cc.getProperties().put(ClientConfig.PROPERTY_FOLLOW_REDIRECTS,true);
		Client c=Client.create();
		c.setConnectTimeout(3000);
	WebResource resource=c.resource("http://localhost:8085/BankBranch/webresources/getBranches");
//	ClientResponse response=resource.get(ClientResponse.class);
  //  int status=response.getStatus();
	String response=resource.accept("application/json").get(String.class);
	System.out.println(response);
	}
}