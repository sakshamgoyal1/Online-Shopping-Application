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

import in.codevita.onlineshoppingapi.domain.User;
import in.codevita.onlineshoppingapi.service.MapValidationErrorService;
import in.codevita.onlineshoppingapi.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("")
	public ResponseEntity<?> createNewUser(@Valid @RequestBody User user, BindingResult result)
	{
		ResponseEntity<?> errorMap= mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		User saveUser= userService.saveorUpdate(user);
		return new ResponseEntity<User>(saveUser,HttpStatus.CREATED);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<?> getUserById(@PathVariable Long userId)
	{
		User user=userService.findUserByUserId(userId);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public Iterable<User> getAllUsers()
	{
		return userService.finaAllUser();
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<?> deleteOrder(@PathVariable Long userId)
	{
		userService.deleteUserByUserId(userId);
		return new ResponseEntity<String>("User :"+userId+" deleted successfully",HttpStatus.OK);
	}
}
