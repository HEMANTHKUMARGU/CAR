package api.com;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ErrorCheck {

	public static void main(String[] args) {
		var url = "https://reqres.in/api/register";
		ErrorPojo p = new ErrorPojo("sydney@fife");
		try {
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(p);
			HttpRequest request = HttpRequest.newBuilder().POST(BodyPublishers.ofString(json))
					.header("Content-Type", "application/Json").header("x-api-key", "reqres-free-v1")
					.uri(URI.create(url)).build();
			HttpClient client = HttpClient.newBuilder().build();
			HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.statusCode());
			if (response.statusCode() == 200) {
				System.out.println("the request is successful");
			} else if (response.statusCode() == 400) {
				System.out.println("the server not understand the request");
			}

			System.out.println(response.body());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
