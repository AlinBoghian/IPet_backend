package com.example.backend_revamped.Repositories;

import com.example.backend_revamped.Models.Shelter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShelterRepository extends MongoRepository<Shelter,String> {
}
