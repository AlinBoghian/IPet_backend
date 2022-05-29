package com.example.backend_revamped.Services;

import com.example.backend_revamped.Models.Shelter;
import com.example.backend_revamped.Repositories.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelterService {

    @Autowired
    ShelterRepository shelterRepo;
    public ResponseEntity<Shelter> getShelter(String id) {
        var option = shelterRepo.findById(id);
        if(option.isPresent()){
            return new ResponseEntity<>(option.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity addShelter(Shelter shelter) {
        shelterRepo.insert(shelter);
        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity<List<Shelter>> getAllShelters() {
        var list = shelterRepo.findAll();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
}
