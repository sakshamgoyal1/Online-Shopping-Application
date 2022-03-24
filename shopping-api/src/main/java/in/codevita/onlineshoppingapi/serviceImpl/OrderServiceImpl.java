package in.codevita.onlineshoppingapi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codevita.onlineshoppingapi.domain.Order;
import in.codevita.onlineshoppingapi.repository.OrderRepository;
import in.codevita.onlineshoppingapi.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order saveOrUpdate(Order order) {
		//Biz logic
		return orderRepository.save(order);
	}
	

}
