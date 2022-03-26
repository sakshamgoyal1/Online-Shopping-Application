package in.codevita.onlineshoppingapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codevita.onlineshoppingapi.domain.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long>{

	Address findByEmail(String email);
	
}
