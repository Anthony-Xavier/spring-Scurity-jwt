package xavier.spring_security_jwt.service;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AutheticationService {

    public String authenticate(Authentication authentication) {
        return "Token";
    }
}
