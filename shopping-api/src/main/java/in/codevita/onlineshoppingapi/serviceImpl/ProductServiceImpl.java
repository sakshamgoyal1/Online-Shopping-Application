package in.codevita.onlineshoppingapi.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codevita.onlineshoppingapi.domain.Order;
import in.codevita.onlineshoppingapi.domain.Product;
import in.codevita.onlineshoppingapi.repository.OrderRepository;
import in.codevita.onlineshoppingapi.repository.ProductReository;
import in.codevita.onlineshoppingapi.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductReository productReository;
	
	@Autowired
	private OrderRepository orderRepository;
	@Override
	public Product saveorUpdate(Long orderId, Product product) {
		Order order=orderRepository.findByOrderId(orderId);
		order.getProducts();
		return productReository.save(product);
	}

	@Override
	public Product findProductByProductId(Long productId) {
		Product product=productReository.findByProductId(productId);
		return product;
	}

	@Override
	public Iterable<Product> finaAllProduct() {
		return productReository.findAll();
	}

	@Override
	public void deleteProductByProductId(Long productId) {
		Product product=productReository.findByProductId(productId);
		productReository.delete(product);
		
	}

	


}
