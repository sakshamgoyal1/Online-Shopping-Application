package in.codevita.onlineshoppingapi.service;

import in.codevita.onlineshoppingapi.domain.Customer;

public interface CustomerService {

	public Customer saveorUpdate(Customer customer);
	
	public Customer findCustomerByMobileNumber(String mobileNumber);
	
	public Iterable<Customer> finaAllCustomer();
	
	public void deleteCustomerByCustomerMobileNumber(String mobileNumber);
}
