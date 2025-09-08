package xavier.spring_security_jwt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import xavier.spring_security_jwt.service.AutheticationService;

@RestController
public class AutheticationController {

    private final AutheticationService autheticationService;

    public AutheticationController(AutheticationService autheticationService) {
        this.autheticationService = autheticationService;
    }

    @PostMapping("authenticate")
    public String authenticate() {
        return autheticationService.authenticate();
    }
}
