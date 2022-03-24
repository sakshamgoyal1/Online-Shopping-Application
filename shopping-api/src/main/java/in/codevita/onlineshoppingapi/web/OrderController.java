package in.codevita.onlineshoppingapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codevita.onlineshoppingapi.domain.Order;
import in.codevita.onlineshoppingapi.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	@PostMapping("")
	public Order createNewOrder(@RequestBody Order order) {
		
		Order savedOrder=orderService.saveOrUpdate(order);
		return savedOrder;
	}

}
