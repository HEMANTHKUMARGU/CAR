package api.com;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jason.pack.JsonObject;

public class PostMain {
	private static HttpRequest.BodyPublisher buildFormDataFromMap(Map<Object, Object> Object) {
		var builder = new StringBuilder();
		for (Map.Entry<Object, Object> entry : Object.entrySet()) {
			if (builder.length() > 0) {
				builder.append("&");
			}
			builder.append(URLEncoder.encode(entry.getKey().toString(), StandardCharsets.UTF_8));
			builder.append("=");
			builder.append(URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8));
		}

		return HttpRequest.BodyPublishers.ofString(builder.toString());
	}

	public static void main(String[] args) {

		String json;

		try {
			PojoClassP1 P = new PojoClassP1("eve.holt@reqres.in", "cityslicka");
			HashMap<Object, Object> Object = new HashMap<Object, Object>();
//			Object.put("email", P.getEmail());
//			Object.put("password", P.getPassword());
//			ObjectMapper mapper = new ObjectMapper();
//			json = mapper.writeValueAsString(P);
			var url = "https://reqres.in/api/login";
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).POST(buildFormDataFromMap(Object))
//					.setHeader("User-Agent", "Java 11 HttpClient Bot")
					.header("Content-Type", "application/x-www-form-urlencoded").header("x-api-key", "reqres-free-v1")
					.build();
			var client = HttpClient.newBuilder().build();

			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.statusCode());
			System.out.println(response.body());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
