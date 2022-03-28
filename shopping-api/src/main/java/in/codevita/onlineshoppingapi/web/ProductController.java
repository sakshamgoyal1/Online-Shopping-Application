package in.codevita.onlineshoppingapi.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codevita.onlineshoppingapi.domain.Product;
import in.codevita.onlineshoppingapi.service.MapValidationErrorService;
import in.codevita.onlineshoppingapi.service.ProductService;

@RestController
@RequestMapping("api/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("")
	public ResponseEntity<?> createNewProduct(@Valid @RequestBody Product product, BindingResult result,@PathVariable Long orderId)
	{
		ResponseEntity<?> errorMap= mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		Product savedProduct= productService.saveorUpdate(orderId, product);
		return new ResponseEntity<Product>(savedProduct,HttpStatus.CREATED);
	}
	
	@GetMapping("/{productId}")
	public ResponseEntity<?> getProductByProductId(@PathVariable Long productId)
	{
		Product product=productService.findProductByProductId(productId);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public Iterable<Product> getAllProducts()
	{
		return productService.finaAllProduct();
	}
	
	@DeleteMapping("/{productId}")
	public ResponseEntity<?> deleteProduct(@PathVariable Long productId)
	{
		productService.deleteProductByProductId(productId);
		return new ResponseEntity<String>("Product Id :"+productId+" deleted successfully",HttpStatus.OK);
	}
}
