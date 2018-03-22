package com.redhat.recommendation;

import org.ff4j.aop.Flip;

import java.util.List;

public interface RecommendationEngine {

    @Flip(name = "newRecommendationEngine", alterBean = "improvedRecommendationEngine")
    public List<String> getRecommendations();

}
