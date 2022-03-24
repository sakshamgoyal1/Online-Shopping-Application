
package in.codevita.onlineshoppingapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codevita.onlineshoppingapi.domain.Customer;
import in.codevita.onlineshoppingapi.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("")
	public Customer createNewCustomer(@RequestBody Customer customer)
	{
		Customer savedCustomer= customerService.addCustomer(customer);
		return savedCustomer;
	}

}
