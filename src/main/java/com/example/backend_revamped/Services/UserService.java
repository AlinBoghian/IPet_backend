package com.example.backend_revamped.Services;

import com.example.backend_revamped.Models.User;
import com.example.backend_revamped.Repositories.UserRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class UserService {

    private UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<User> getUser(String id) {
        var option = userRepository.findById(id);
        if(option.isPresent()){
            return new ResponseEntity<>(option.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity addUser(User user) {
        userRepository.insert(user);
        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity<List<User>> getAllUsers() {
        var list = userRepository.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
