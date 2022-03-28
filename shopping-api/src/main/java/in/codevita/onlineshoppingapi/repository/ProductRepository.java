package in.codevita.onlineshoppingapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codevita.onlineshoppingapi.domain.Product;

@Repository
public interface ProductReository extends CrudRepository<Product, Long>{

  Product findByProductId(Long productId);
    	

	Iterable<Product> findAll();
	
}
