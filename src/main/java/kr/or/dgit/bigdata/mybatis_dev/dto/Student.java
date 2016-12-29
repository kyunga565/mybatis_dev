package kr.or.dgit.bigdata.mybatis_dev.dto;

import java.util.Date;

public class Student {
	private int studId;
	private String name;
	private String email;
	private PhoneNumber phone;
	private Date dob;
	private Address addr_id;
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
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
	public void setPhonenumber(PhoneNumber phone) {
		this.phone = phone;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return addr_id;
	}
	public void setAddress(Address addr_id) {
		this.addr_id = addr_id;
	}
	@Override
	public String toString() {
		return String.format("Student [studId=%s, name=%s, email=%s, phone=%s, dob=%s, addr_id=%s]", studId, name,
				email, phone, dob, addr_id);
	}
	
}
