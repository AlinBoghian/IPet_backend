package com.example.backend_revamped.Services;

import com.example.backend_revamped.Models.Review;
import com.example.backend_revamped.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepo;
    public ResponseEntity<Review> getReview(String id) {
        var option = reviewRepo.findById(id);
        if(option.isPresent()) {
            Review review = option.get() ;
            return new ResponseEntity<Review>(review,HttpStatus.OK);
        }
        return new ResponseEntity<Review>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<List<Review>> getAllReviews() {
        var list = reviewRepo.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    public ResponseEntity addReview(Review review){
        reviewRepo.insert(review);
        return new ResponseEntity(HttpStatus.OK);
    }
}
