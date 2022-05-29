package com.example.backend_revamped.Services;

import com.example.backend_revamped.Models.Lost;
import com.example.backend_revamped.Repositories.LostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LostService {
    @Autowired
    private LostRepository lostRepo;
    public ResponseEntity<Lost> getLost(String id) {
        var option = lostRepo.findById(id);
        if(option.isPresent())
            return new ResponseEntity<>(option.get(), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity addLost(Lost lost) {
        lostRepo.insert(lost);
        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity getAllLost() {
        var list = lostRepo.findAll();
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
