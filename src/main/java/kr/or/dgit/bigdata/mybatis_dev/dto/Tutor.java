package kr.or.dgit.bigdata.mybatis_dev.dto;

import java.util.List;

public class Tutor {
	private int TutorId;
	private String name;
	private String email;
	private Address address;
	private List<Course> courses;
	
	
	public int getTutorId() {
		return TutorId;
	}
	public void setTutorId(int TutorId) {
		this.TutorId = TutorId;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return String.format("Tutor [tutorId=%s, name=%s, email=%s, address=%s, courses=%s]", TutorId, name, email,
				address, courses);
	}
	
}
