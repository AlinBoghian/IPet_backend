package com.example.backend_revamped.Controllers;

import com.example.backend_revamped.Models.Review;
import com.example.backend_revamped.Services.ReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/reviews")
public class ReviewController {

    private ReviewService reviewService;

    @GetMapping("/{id}")
    public ResponseEntity<Review> getReview(@PathVariable(name = "id") String id){
        return reviewService.getReview(id);
    }

    @GetMapping
    public ResponseEntity<List<Review>> getAllReview(){
        return reviewService.getAllReviews();
    }

    @PostMapping()
    public ResponseEntity addReview(@RequestBody Review review){
        return reviewService.addReview(review);
    }
}
