package in.codevita.onlineshoppingapi.service;

import in.codevita.onlineshoppingapi.domain.Product;

public interface ProductService {

	public Product saveorUpdate(Long orderId,Product product);
	
	public Product findProductByProductId(Long productId);
	
	public Iterable<Product> finaAllProduct();
	
	public void deleteProductByProductId(Long productId);

}
