import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Greedy2 {

    public static void main(String[] args) {
        List<List<Integer>> problem = new ArrayList<>();
        List<Integer> problem1 = new ArrayList<>();
        problem1.add(1);
        problem1.add(-3);
        problem.add(problem1);
        Solution solution = new Solution();
        List<List<Integer>> list = solution.nearestVegetarianRestaurant(3, problem, 1);
    }

    public static class Solution {
        public Solution() {

        }

        public List<List<Integer>> nearestVegetarianRestaurant(int totalRestaurants,
                                                               List<List<Integer>> allLocations,
                                                               int numRestaurants) {
            List<DistanceCoordinates> distances = new ArrayList<>();
            List<List<Integer>> result = new ArrayList<>();
            for (List<Integer> coordinates : allLocations) {
                Double distance = calculate(coordinates.get(0), coordinates.get(1));
                DistanceCoordinates distanceCoordinates = new DistanceCoordinates(coordinates, distance);
                distances.add(distanceCoordinates);
            }

            Collections.sort(distances);

            for (int i = 0; i < numRestaurants; i++) {
                DistanceCoordinates current = distances.get(i);
                result.add(current.coordinates);
            }

            return result;
        }

        public Double calculate(int xCoordinate, int yCoordinate) {
            double squared = Math.pow(xCoordinate, 2) + Math.pow(yCoordinate, 2);
            return Math.sqrt(squared);
        }
    }

    static class DistanceCoordinates implements Comparable<DistanceCoordinates> {

        public List<Integer> coordinates;
        public Double distance;

        DistanceCoordinates(List<Integer> coordinates, Double distance) {
            this.coordinates = coordinates;
            this.distance = distance;
        }

        public int compareTo(DistanceCoordinates o) {
            return this.distance.compareTo(o.distance);
        }
    }
}
