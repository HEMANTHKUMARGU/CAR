package api.com;

import java.util.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.util.ArrayList;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PostTest {

	public static void main(String[] args) {
		var url = "https://reqres.in/api/users";
		Putpojo P = new Putpojo("karthik", "Intern");
		PojoClassP1 P1 = new PojoClassP1("Karthik", "BE");
		Map<String, Object> jobRequest = new LinkedHashMap<>();
		jobRequest.put("name", P.getName());
		jobRequest.put("job", P.getJob());
		Map<String, Object> schoolRequest = new LinkedHashMap<>();
		schoolRequest.put("schoolName", P1.getSchoolName());
		schoolRequest.put("class", P1.getClass1());
		Map<String, Object> response = new LinkedHashMap<>();
		response.put("request", Arrays.asList(jobRequest, schoolRequest));
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writeValueAsString(response);
			System.out.println(json);
			HttpRequest request = HttpRequest.newBuilder().POST(BodyPublishers.ofString(json)).uri(URI.create(url))
					.header("Content-type", "application/Json").header("x-api-key", "reqres-free-v1").build();
			HttpClient client = HttpClient.newBuilder().build();
			HttpResponse<String> response1 = client.send(request, HttpResponse.BodyHandlers.ofString());
			String responseBody = response1.body();
			System.out.println(response1.statusCode());
			String modifiedBody = responseBody.replaceFirst("\"request\"", "\"response\"");
			System.out.println(modifiedBody);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
