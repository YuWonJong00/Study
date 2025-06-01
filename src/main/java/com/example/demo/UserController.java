package com.example.demo;



import com.example.demo.user.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    @PostMapping
    public void create(@RequestBody User user) {
        userRepository.save(user);
    }

    @GetMapping
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
