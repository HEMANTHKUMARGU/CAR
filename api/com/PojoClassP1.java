package api.com;

public class PojoClassP1 {
	private String SchoolName;
	private String class1;
	
	public PojoClassP1(String schoolName, String class1) {
		super();
		SchoolName = schoolName;
		this.class1 = class1;
	}
	

	public String getSchoolName() {
		return SchoolName;
	}


	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}


	public String getClass1() {
		return class1;
	}


	public void setClass1(String class1) {
		this.class1 = class1;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return SchoolName+" "+class1;
	}

}
