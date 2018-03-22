package com.redhat.recommendation;

import java.util.Arrays;
import java.util.List;

public class ImprovedRecommendationEngine implements RecommendationEngine {

    @Override
    public List<String> getRecommendations() {
        return Arrays.asList("steak", "wine", "ice cream");
    }

}
