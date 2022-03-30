package in.codevita.onlineshoppingapi.service;

import in.codevita.onlineshoppingapi.domain.User;

public interface UserService {

public User saveorUpdate(User user);
	
	public User findUserByUserId(Long userId);
	
	public Iterable<User> finaAllUser();
	
	public void deleteUserByUserId(Long userId);
}
