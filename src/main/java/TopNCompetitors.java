

import java.util.*;

class TopNCompetitors {
    public static ArrayList<String> topNCompetitors(int numCompetitors,
                                                    int topNCompetitors,
                                                    List<String> competitors,
                                                    int numReviews,
                                                    List<String> reviews) {
        Map<String, Integer> competitorsReviewCountMap = new HashMap<>();
        List<CompetitorsReviewNode> competitorsReviewList = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();

        for (String review : reviews) {
            for (String competitor : competitors) {
                if (review.contains(competitor)) {
                    competitorsReviewCountMap.merge(competitor, 1, Integer::sum);
                }
            }

        }

        for (String competitor : competitorsReviewCountMap.keySet()) {
            competitorsReviewList.add(new CompetitorsReviewNode(competitor, competitorsReviewCountMap.get(competitor)));
        }

        Collections.sort(competitorsReviewList);

        for (int i = 0; i < topNCompetitors; i++) {
            result.add(competitorsReviewList.get((competitorsReviewList.size() - 1) - i).getCompetitor());
        }

        return result;
    }

    private static class CompetitorsReviewNode implements Comparable<CompetitorsReviewNode> {

        private String competitor;

        private Integer reviewCount;

        public CompetitorsReviewNode(String competitor, int reviewCount) {
            this.competitor = competitor;
            this.reviewCount = reviewCount;
        }

        public String getCompetitor() {
            return competitor;
        }

        public Integer getReviewCount() {
            return reviewCount;
        }

        @Override
        public int compareTo(CompetitorsReviewNode o) {
            int compareTo = this.reviewCount.compareTo(o.reviewCount);
            if (compareTo == 0) {
                return this.competitor.compareTo(o.competitor);
            }

            return compareTo;
        }
    }
}