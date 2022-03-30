package in.codevita.onlineshoppingapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codevita.onlineshoppingapi.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	User findByMobileNumber(String mobileNumber);
}
