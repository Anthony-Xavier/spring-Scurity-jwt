package xavier.spring_security_jwt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository <User, String >{
    Optional <User> findByUsername(String username);
}
