package api.coml;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class Main {
		    public static void main(String[] args) throws Exception {
		        Map<String, Object> jobRequest = new LinkedHashMap<>();
		        jobRequest.put("name", "karthik");
		        jobRequest.put("job", "Intern");

		        Map<String, Object> schoolRequest = new LinkedHashMap<>();
		        schoolRequest.put("schoolName", "karthik");
		        schoolRequest.put("class", "BE");

		        Map<String, Object> response = new LinkedHashMap<>();
		        response.put("response", Arrays.asList(jobRequest, schoolRequest));

		        ObjectMapper mapper = new ObjectMapper();
		        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
		        System.out.println(json);
		    }
		}

	}

}
