package in.codevita.onlineshoppingapi.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import in.codevita.onlineshoppingapi.domain.Address;
import in.codevita.onlineshoppingapi.domain.Customer;
import in.codevita.onlineshoppingapi.exception.CustomerIdException;
//import in.codevita.onlineshoppingapi.repository.AddressRepository;
import in.codevita.onlineshoppingapi.repository.CustomerRepository;
import in.codevita.onlineshoppingapi.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
//	@Autowired
//	private AddressRepository addressRespository;
	
	@Override
	public Customer saveorUpdate(Customer customer) {
	
	try {
		return customerRepository.save(customer);
	}
	catch (Exception e) {
	throw new CustomerIdException("Customer Email: "+customer.getEmail()+" already exist");
	}
  }

	@Override
	public Customer findCustomerByEmailId(String emailId) {
		Customer customer= customerRepository.findByEmail(emailId);
		if(customer==null)
		{
			throw new CustomerIdException("Customer Email: "+emailId+" does not exist");
		}
		return customer;
	}

	@Override
	public Iterable<Customer> finaAllCustomer() {
		return customerRepository.findAll();
	
	}

	@Override
	public void deleteCustomerByCustomerEmailId(String emailId) {
		Customer customer= customerRepository.findByEmail(emailId);
		if(customer==null)
		{
			throw new CustomerIdException("Customer Email: "+emailId+" does not exist");
		}
		customerRepository.delete(customer);
	}
}
