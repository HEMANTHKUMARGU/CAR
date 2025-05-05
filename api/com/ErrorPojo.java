package api.com;

public class ErrorPojo {
	private String email;

	public ErrorPojo(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return email;
	}

}
