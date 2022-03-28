package in.codevita.onlineshoppingapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codevita.onlineshoppingapi.domain.Address;
import in.codevita.onlineshoppingapi.domain.Customer;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long>{
Address findByAddressId(Long addressId);
	

	Iterable<Address> findAll();

}
