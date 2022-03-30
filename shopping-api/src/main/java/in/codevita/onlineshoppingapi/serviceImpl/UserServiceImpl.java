package in.codevita.onlineshoppingapi.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codevita.onlineshoppingapi.domain.User;
import in.codevita.onlineshoppingapi.exception.UserIdException;
import in.codevita.onlineshoppingapi.repository.UserRepository;
import in.codevita.onlineshoppingapi.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveorUpdate(User user) {
		return userRepository.save(user);
		
	}

	@Override
	public User findUserByUserId(Long userId) {
		User user=userRepository.findByUserId(userId);
		return user;
	}

	@Override
	public Iterable<User> finaAllUser() {
		return userRepository.findAll();
	}

	@Override
	public void deleteUserByUserId(Long userId) {
		User user=userRepository.findByUserId(userId);
		userRepository.delete(user);
	}

}
