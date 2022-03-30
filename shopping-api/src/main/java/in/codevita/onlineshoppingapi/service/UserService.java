package in.codevita.onlineshoppingapi.service;

import in.codevita.onlineshoppingapi.domain.User;

public interface UserService {

public User saveorUpdate(User user);
	
	public User findUserByUserMobileNumber(String mobileNumber);
	
	public Iterable<User> finaAllUser();
	
	public void deleteUserByUserMobileNumber(String mobileNumber);
}
