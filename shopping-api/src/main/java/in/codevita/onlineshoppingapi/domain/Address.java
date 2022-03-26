package in.codevita.onlineshoppingapi.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long addressId;
	private String email;
	private String streetNo;
	private String buildingName;
	private String city;
	private String state;
	private String country;
	private String pincode;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="customer_id",nullable = false)
	@JsonIgnore
	private Customer customer;
	
	public Address() {
		super();
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", email=" + email + ", streetNo=" + streetNo + ", buildingName="
				+ buildingName + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode
				+ ", customer=" + customer + "]";
	}
}
