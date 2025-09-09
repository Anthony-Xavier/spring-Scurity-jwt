package xavier.spring_security_jwt.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import xavier.spring_security_jwt.model.UserAuthenticated;
import xavier.spring_security_jwt.repository.UserRepository;

public class UserDateilsService implements UserDetailsService {
    private final UserRepository userRepository;

    public UserDateilsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .map(UserAuthenticated::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
