package in.codevita.onlineshoppingapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long number;
	@NotBlank(message = "firstName is required")
	private String firstName;
	@NotBlank(message = "email is required")
	@Column(updatable = false, unique = true)
	private String email;
	@NotBlank(message = "password is required")
	@Size(min = 4, max = 12, message = "create password between 4 to 12 characters limit.")
	private String password;
	private Date start_date;
	private Date end_date;
	
	private Date created_At;
	private Date updated_At;
	
	
	public User() {
		super();
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String secondName) {
		this.email = secondName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public Date getCreated_At() {
		return created_At;
	}
	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}
	public Date getUpdated_At() {
		return updated_At;
	}
	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}
	
	
	
	@PrePersist
	public void onCreate() {
		this.created_At=new Date();
	}
	
	@PreUpdate
	public void onUpdate() {
		this.updated_At = new Date();	
	}
	
}
