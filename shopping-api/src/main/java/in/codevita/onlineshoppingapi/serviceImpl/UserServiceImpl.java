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
		try {
		return userRepository.save(user);
		}
		catch (Exception e) {
			throw new UserIdException("User with number "+user.getMobileNumber()+"already exist");
		}
		
	}

	@Override
	public User findUserByUserMobileNumber(String mobileNumber) {
		User user=userRepository.findByMobileNumber(mobileNumber);
		if(user==null)
		{
			throw new UserIdException("User mobile Number "+mobileNumber+" not exist");
		}
		return user;
	}

	@Override
	public Iterable<User> finaAllUser() {
		return userRepository.findAll();
	}

	@Override
	public void deleteUserByUserMobileNumber(String mobileNumber) {
		User user=userRepository.findByMobileNumber(mobileNumber);
		if(user==null)
		{
			throw new UserIdException("User mobile Number "+mobileNumber+" not exist");
		}
		userRepository.delete(user);
	}

}
