package xavier.spring_security_jwt.service;

import org.springframework.stereotype.Service;

@Service
public class AutheticationService {

    public String authenticate() {
        return "Token";
    }
}
