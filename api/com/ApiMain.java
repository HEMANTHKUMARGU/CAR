package api.com;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONObject;

public class ApiMain {

	public static void main(String[] args) {
		var url = "https://reqres.in/api/unknown";
		var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
		var client = HttpClient.newBuilder().build();
		try {
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.statusCode());
			System.out.println(response.body());
//			JSONObject jobj = new JSONObject(response.body());
//			for(String key:jobj.keySet())
//			{
//				 Object value = jobj.get(key);
//				 System.out.println(key+":"+value);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
//	https://api.github.com/users/LearnCodeWithDurgesh

}
