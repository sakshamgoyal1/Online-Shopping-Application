package in.codevita.onlineshoppingapi.service;

import in.codevita.onlineshoppingapi.domain.User;

public interface UserService {

	public User saveOrUpdate(User user);
	
	public User findUserByEmail(String projectId);
	
	public Iterable<User> FindAllUser();
	
	public void deleteUserByEmail(String projectId);
	

	
}
