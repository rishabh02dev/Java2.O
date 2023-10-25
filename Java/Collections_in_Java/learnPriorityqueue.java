import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class learnPriorityqueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        //now using this comparator.reverseorder this is converted into max heap from min heap.
        pq.offer(40);
        pq.offer(12);
        pq.offer(36);
        pq.offer(24);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        //

    }
}
