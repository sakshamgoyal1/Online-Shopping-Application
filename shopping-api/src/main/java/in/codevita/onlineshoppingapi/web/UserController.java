package in.codevita.onlineshoppingapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codevita.onlineshoppingapi.domain.User;
import in.codevita.onlineshoppingapi.service.UserService;
@RestController
@RequestMapping("/api/users")
public class UserController{
	
	@Autowired
	private UserService userService;
	
	@PostMapping("")
	public User createNewUser(@RequestBody User user) {
		User savedUser = userService.saveOrUpdate(user);
		return savedUser;
		
	}
	
	
	
}
