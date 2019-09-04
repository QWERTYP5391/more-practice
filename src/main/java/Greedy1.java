import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Greedy1 {

    public static void main(String[] args) {
        List<List<Integer>> problems = new ArrayList<List<Integer>>();
        load(problems, 8, 7);

        List<List<Integer>> returnProblems = new ArrayList<List<Integer>>();
        load(returnProblems, 5, 10);

        List<List<Integer>> lists = optimalUtilization(20, problems, returnProblems);
        for (List<Integer> list : lists) {
            for (Integer num : list) {
                System.out.println(num);
            }
        }
    }

    private static void load(List<List<Integer>> problems, int i, int i2) {
        List<Integer> problem1 = new ArrayList<Integer>();
        problem1.add(1);
        problem1.add(i);
        List<Integer> problem2 = new ArrayList<Integer>();
        problem2.add(2);
        problem2.add(i2);
        List<Integer> problem3 = new ArrayList<Integer>();
        problem3.add(3);
        problem3.add(14);
        problems.add(problem1);
        problems.add(problem2);
        problems.add(problem3);
    }

    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    static List<List<Integer>> optimalUtilization(int maxTravelDist,
                                                  List<List<Integer>> forwardRouteList,
                                                  List<List<Integer>> returnRouteList) {
        // WRITE YOUR CODE HERE
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<RouteDistance> forwardRouteDistance = new ArrayList<RouteDistance>();
        List<RouteDistance> returnRouteDistance = new ArrayList<RouteDistance>();
        populate(forwardRouteList, forwardRouteDistance);
        Collections.sort(forwardRouteDistance);
        populate(returnRouteList, returnRouteDistance);
        Collections.sort(returnRouteDistance);

        int forwardCounter = 0;
        int returnCounter = 0;
        while (forwardCounter < forwardRouteDistance.size() && returnCounter < returnRouteDistance.size()) {
            RouteDistance currentForwardRouteDistance = forwardRouteDistance.get(forwardCounter);
            int currentForwardRoute = currentForwardRouteDistance.distance;

            RouteDistance currentReturnRouteDistance = returnRouteDistance.get(returnCounter);
            int currentReturnRoute = currentReturnRouteDistance.distance;

            if (currentForwardRoute + currentReturnRoute <= maxTravelDist) {
                List<Integer> combination = new ArrayList<Integer>();
                combination.add(currentForwardRouteDistance.id);
                combination.add(currentReturnRouteDistance.id);
                result.add(combination);
                forwardCounter++;
                returnCounter++;
            } else if (returnCounter + 1 < returnRouteDistance.size()) {
                returnCounter++;
            } else {
                forwardCounter++;
            }
        }
        return result;
    }

    public static void populate(List<List<Integer>> returnRouteList, List<RouteDistance> returnRouteDistance) {
        for (List<Integer> currentRoute : returnRouteList) {
            returnRouteDistance.add(new RouteDistance(currentRoute.get(0), currentRoute.get(1)));
        }
    }

    static class RouteDistance implements Comparable<RouteDistance>{
        public Integer id;
        public Integer distance;

        public RouteDistance(Integer id, Integer distance){
            this.id = id;
            this.distance = distance;
        }

        public int compareTo(RouteDistance o) {
            return o.distance.compareTo(this.distance);
        }
    }
    // METHOD SIGNATURE ENDS
}
