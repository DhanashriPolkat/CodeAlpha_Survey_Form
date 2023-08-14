package form_bo;

public class SurveyForm_bo {
	
	private String rollNo;
	private String name;
	private String email;
	private String mobNo;
	private String city;
	private String course;
	private String gender;
	private String dob;
	private String age;
	
	
	
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public SurveyForm_bo(String rollNo, String name, String email, String mobNo, String city, String course,
			String gender, String dob, String age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
		this.mobNo = mobNo;
		this.city = city;
		this.course = course;
		this.gender = gender;
		this.dob = dob;
		this.age = age;
	}
	public SurveyForm_bo() {
		super();
	}
	@Override
	public String toString() {
		return "SurveyForm_bo [rollNo=" + rollNo + ", name=" + name + ", email=" + email + ", mobNo=" + mobNo
				+ ", city=" + city + ", course=" + course + ", gender=" + gender + ", dob=" + dob + ", age=" + age
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	

}
