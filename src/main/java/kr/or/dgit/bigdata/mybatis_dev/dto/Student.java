package kr.or.dgit.bigdata.mybatis_dev.dto;

import java.util.Date;

public class Student {
	private int stdId;
	private String name;
	private String email;
	private PhoneNumber phone;
	private Date dob;
	
	
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
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
	public PhoneNumber getPhonenumber() {
		return phone;
	}
	public void setPhonenumber(PhoneNumber phonenumber) {
		this.phone = phonenumber;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return String.format("Student [stdId=%s, name=%s, email=%s, phonenumber=%s, dob=%s]", stdId, name, email,
				phone, dob);
	}
	
}
