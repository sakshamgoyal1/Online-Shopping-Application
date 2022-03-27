package in.codevita.onlineshoppingapi.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codevita.onlineshoppingapi.domain.Customer;
import in.codevita.onlineshoppingapi.domain.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long>{
    Order findByOrderId(Long orderId);
			

	Iterable<Order> findAll();
}
