package kr.or.dgit.bigdata.mybatis_dev.dto;

public class Address {
	private int addrId;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String contry;
	public int getAddrId() {
		return addrId;
	}
	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
	@Override
	public String toString() {
		return String.format("Address %s, %s, %s, %s, %s,%s", addrId, street, city, state, zip, contry);
	}
}
