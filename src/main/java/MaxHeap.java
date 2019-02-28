import java.util.PriorityQueue;

public class MaxHeap {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        priorityQueue.add(25);
        priorityQueue.add(-22);
        priorityQueue.add(1343);
        priorityQueue.add(54);
        priorityQueue.add(0);
        priorityQueue.add(-3492);
        priorityQueue.add(429);

        Integer peek = priorityQueue.peek();

        System.out.println(peek);
    }
}
