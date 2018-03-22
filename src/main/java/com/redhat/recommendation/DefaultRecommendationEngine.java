package com.redhat.recommendation;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class DefaultRecommendationEngine implements RecommendationEngine {

    @Override
    public List<String> getRecommendations() {
        return Arrays.asList("burger", "soda", "hot dog");
    }

}
