package in.codevita.onlineshoppingapi.service;

import in.codevita.onlineshoppingapi.domain.Customer;

public interface CustomerService {

	public Customer saveorUpdate(Customer customer);
	
	public Customer findCustomerByEmailId(String emailId);
	
	public Iterable<Customer> finaAllCustomer();
	
	public void deleteCustomerByCustomerEmailId(String emailId);
}
	
