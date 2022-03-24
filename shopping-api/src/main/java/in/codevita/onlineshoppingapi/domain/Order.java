package in.codevita.onlineshoppingapi.domain;

import java.util.Date;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	private Date orderDate;
	private String orderStatus;
	private Map<Long,String> productlist;
	
	
	private Date created_At;
	private Date updated_At;
	
	
	public Order() {
		super();
	}
	
	
	public Long getOrderId() {
		return orderId;
	}


	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Map<Long, String> getProductlist() {
		return productlist;
	}


	public void setProductlist(Map<Long, String> productlist) {
		this.productlist = productlist;
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
		this.created_At= new Date();
		
	}
	
	@PreUpdate
	public void onUpdate() {
		this.updated_At= new Date();
	}

}
