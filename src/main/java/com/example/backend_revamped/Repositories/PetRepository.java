package com.example.backend_revamped.Repositories;

import com.example.backend_revamped.Models.Pet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PetRepository extends MongoRepository<Pet,String> {
}
