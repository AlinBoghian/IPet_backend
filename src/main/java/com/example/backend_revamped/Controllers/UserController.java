package com.example.backend_revamped.Controllers;
import com.example.backend_revamped.Models.User;
import com.example.backend_revamped.Services.UserService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@NoArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("{id}")
    ResponseEntity<User> getUser(String id){
        return userService.getUser(id);
    }

    @GetMapping
    ResponseEntity getAllUsers(){
        return userService.getAllUsers();
    }
    @PostMapping
    ResponseEntity addUser(User lost){
        return userService.addUser(lost);
    }

}
