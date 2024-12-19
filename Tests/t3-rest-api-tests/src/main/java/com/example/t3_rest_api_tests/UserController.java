package com.example.t3_rest_api_tests;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{identifier}")
    public UserEntity getUsersByIdentifier(@PathVariable String identifier) {

        if (identifier.matches("\\d+")) {
            Long id = Long.parseLong(identifier);
            return userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        }

        return userRepository.findByUsername(identifier).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
