import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.addFirst(12);
        adq.addLast(45);
        adq.offer(13);
        System.out.println(adq);

        System.out.println(adq.pollLast());
        
    }
}
