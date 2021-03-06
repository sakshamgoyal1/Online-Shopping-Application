package in.codevita.onlineshoppingapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codevita.onlineshoppingapi.domain.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

	Customer findByMobileNumber(String mobileNumber);
	

	Iterable<Customer> findAll();
}
