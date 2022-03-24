package in.codevita.onlineshoppingapi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codevita.onlineshoppingapi.domain.User;
import in.codevita.onlineshoppingapi.repository.UserRepository;
import in.codevita.onlineshoppingapi.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveOrUpdate(User user) {
		return userRepository.save(user);
	}
	
	

}
