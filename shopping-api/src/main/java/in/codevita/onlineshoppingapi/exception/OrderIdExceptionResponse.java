package in.codevita.onlineshoppingapi.exception;

public class OrderIdExceptionResponse {
	private String orderId;

	public OrderIdExceptionResponse(String orderId) {
		super();
		this.orderId = orderId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderIdentifier(String orderId) {
		this.orderId = orderId;
	}
	
	

}
