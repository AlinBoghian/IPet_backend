package com.example.backend_revamped.Controllers;

import com.example.backend_revamped.Models.Shelter;
import com.example.backend_revamped.Services.ShelterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/shelters")
public class ShelterController {
    @Autowired
    ShelterService shelterService;

    @GetMapping("/{id}")
    public ResponseEntity<Shelter> getShelter(@PathVariable(name = "id") String id){
        return shelterService.getShelter(id);
    }

    @GetMapping
    public ResponseEntity<List<Shelter>> getAllShelters(){
        return shelterService.getAllShelters();
    }

    @PostMapping
    public ResponseEntity addShelter(@RequestBody Shelter shelter){
        return shelterService.addShelter(shelter);
    }
}
