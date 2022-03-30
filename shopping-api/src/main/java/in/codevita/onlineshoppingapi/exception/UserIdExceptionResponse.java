package in.codevita.onlineshoppingapi.exception;

public class UserIdExceptionResponse {

	private String mobileNumber;

	public UserIdExceptionResponse(String mobileNumber)
	{
		super();
		this.mobileNumber = mobileNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}
