package in.codevita.onlineshoppingapi.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.aspectj.weaver.ast.Or;
import org.hibernate.type.TrueFalseType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	@NotBlank(message = "Please enter your password")
	private String password;
	@NotBlank(message = "Please enter mobile number")
	 @Size(min = 10, max=10, message = "Please Enter Correct Mobile Number")
	    @Column(updatable = false, unique = true)
	private String mobileNumber;
	@JsonFormat(pattern="yyy-MM-dd")
	private Date created_At;
	@JsonFormat(pattern="yyy-MM-dd")
	private Date updated_At;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Customer customer;
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		this.created_At = new Date();
	}

	@PreUpdate
	public void onUpdate() {
		this.updated_At = new Date();
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
