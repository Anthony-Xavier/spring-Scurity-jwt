package xavier.spring_security_jwt.repository;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository <User, String >{
    Optional <User> findByUsername(String username);
}
