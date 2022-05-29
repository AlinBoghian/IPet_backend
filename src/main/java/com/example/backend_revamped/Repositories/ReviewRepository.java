package com.example.backend_revamped.Repositories;

import com.example.backend_revamped.Models.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, String> {

}
