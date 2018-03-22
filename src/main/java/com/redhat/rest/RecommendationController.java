package com.redhat.rest;

import com.redhat.recommendation.DefaultRecommendationEngine;
import com.redhat.recommendation.ImprovedRecommendationEngine;
import com.redhat.recommendation.RecommendationEngine;
import org.ff4j.FF4j;
import org.ff4j.spring.autowire.FF4JFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecommendationController {

    @Autowired
    private RecommendationEngine recommendationEngine;

    @FF4JFeature("newRecommendationEngine")
    @RequestMapping(path = "/recommendations")
    public List<String> recommendations() {
        return recommendationEngine.getRecommendations();
    }

}
