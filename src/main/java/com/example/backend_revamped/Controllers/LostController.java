package com.example.backend_revamped.Controllers;

import com.example.backend_revamped.Models.Lost;
import com.example.backend_revamped.Services.LostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/lost")
public class LostController {
    @Autowired
    private LostService lostService;

    @GetMapping("{id}")
    ResponseEntity<Lost> getLost(String id){
        return lostService.getLost(id);
    }

    @GetMapping
    ResponseEntity getAllLost(){
        return lostService.getAllLost();
    }
    @PostMapping
    ResponseEntity addLost(Lost lost){
        return lostService.addLost(lost);
    }

}
