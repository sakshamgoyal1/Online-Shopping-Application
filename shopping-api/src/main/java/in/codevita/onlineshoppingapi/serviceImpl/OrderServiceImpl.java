package in.codevita.onlineshoppingapi.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codevita.onlineshoppingapi.domain.Customer;
import in.codevita.onlineshoppingapi.domain.Order;
import in.codevita.onlineshoppingapi.repository.OrderRepository;
import in.codevita.onlineshoppingapi.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	public OrderRepository orderrepo;
	
	@Override
	public Order saveorUpdate(Order order) {
		return orderrepo.save(order);
	}

	@Override
	public Order findOrderByCustomer(Long orderId) {
		Order order=orderrepo.findByOrderId(orderId);
		return order;
	}

	@Override
	public Iterable<Order> finaAllOrder() {
		return orderrepo.findAll();
	}

	@Override
	public void deleteOrderByCustomer(Long orderId) {
		Order order=orderrepo.findByOrderId(orderId);
		orderrepo.delete(order);
	}

}
