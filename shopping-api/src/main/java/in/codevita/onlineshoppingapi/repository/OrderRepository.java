package in.codevita.onlineshoppingapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codevita.onlineshoppingapi.domain.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long>{
	
	//TODO: no need to add CRUD operations over here, if any customisation is required we can customize the CRUD methods.

}
