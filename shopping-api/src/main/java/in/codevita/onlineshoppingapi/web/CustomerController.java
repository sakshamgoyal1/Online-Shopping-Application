package in.codevita.onlineshoppingapi.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codevita.onlineshoppingapi.domain.Customer;
import in.codevita.onlineshoppingapi.service.CustomerService;
import in.codevita.onlineshoppingapi.service.MapValidationErrorService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("")
	public ResponseEntity<?> createNewCustomer(@Valid @RequestBody Customer customer, BindingResult result)
	{
		ResponseEntity<?> errorMap= mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		Customer savedCustomer= customerService.saveorUpdate(customer);
		return new ResponseEntity<Customer>(savedCustomer,HttpStatus.CREATED);
	}
	
	@GetMapping("/{emailId}")
	public ResponseEntity<?> getCustomerByEmailId(@PathVariable String emailId)
	{
		Customer customer=customerService.findCustomerByEmailId(emailId);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public Iterable<Customer> getAllCustomers()
	{
		return customerService.finaAllCustomer();
	}
	
	@DeleteMapping("/{emailId}")
	public ResponseEntity<?> deleteCustomer(@PathVariable String emailId)
	{
		customerService.deleteCustomerByCustomerEmailId(emailId);
		return new ResponseEntity<String>("Customer with Email Id :"+emailId+" deleted successfully",HttpStatus.OK);
	}
}
