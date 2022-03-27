package in.codevita.onlineshoppingapi.service;

import in.codevita.onlineshoppingapi.domain.Customer;
import in.codevita.onlineshoppingapi.domain.Order;

public interface OrderService {

public Order saveorUpdate(Order order);
	
	public Order findOrderByCustomer(Long orderId);
	
	public Iterable<Order> finaAllOrder();
	
	public void deleteOrderByCustomer(Long orderId);

}
