package api.com;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Put {

	public static void main(String[] args) {
		var url = "https://reqres.in/api/users/2";
		Putpojo P = new Putpojo("Hemanth", "engineering");
		PojoClassP1 P1=new PojoClassP1("eve.holt@reqres.in", "cityslicka");
		ArrayList Array=new ArrayList();
		Array.add(P);
		Array.add(P1);
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writeValueAsString(Array);
			HttpRequest request = HttpRequest.newBuilder().PUT(BodyPublishers.ofString(json))
					.header("Content-Type", "application/json").header("x-api-key", "reqres-free-v1")
					.uri(URI.create(url)).build();
			HttpClient client = HttpClient.newBuilder().build();
			HttpResponse responce = client.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(responce.statusCode());
			if(responce.statusCode()==200)
			{
				System.out.println("request is sucssfull");
			}
			System.out.println(responce.body());
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
