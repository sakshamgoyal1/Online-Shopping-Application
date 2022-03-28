package in.codevita.onlineshoppingapi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codevita.onlineshoppingapi.domain.User;
import in.codevita.onlineshoppingapi.exception.UserIdException;
import in.codevita.onlineshoppingapi.repository.UserRepository;
import in.codevita.onlineshoppingapi.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveOrUpdate(User user) {
		
		try {
			user.setemail(user.getemail().toUpperCase());
			return userRepository.save(user);
		}catch(Exception ex) {
			throw new UserIdException("User Id: "+user.getemail().toUpperCase()+" already Exists");
	}
}

	@Override
	public User findUserByEmail(String projectId) {
		// TODO Auto-generated method stub
		User user =userRepository.findByEmail(projectId.toUpperCase());
		if(user==null) {
			throw new UserIdException("User ID: "+projectId.toUpperCase()+ " does not exists");
		}
		return user;
	}
	
	@Override
	public Iterable<User> FindAllUser() {
		return userRepository.findAll();
	}

	@Override
	public void deleteUserByEmail(String projectId) {
		// TODO Auto-generated method stub
		User user =userRepository.findByEmail(projectId.toUpperCase());
		if(user==null) {
			throw new UserIdException("User ID: "+projectId.toUpperCase()+ " does not exists");
		}
		
		userRepository.delete(user);
		
	}
}

