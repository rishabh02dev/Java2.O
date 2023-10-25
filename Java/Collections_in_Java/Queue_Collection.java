import java.util.LinkedList;
import  java.util.Queue;

public class Queue_Collection {
    public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();

    queue.offer(12);
    queue.offer(24);
    queue.offer(36);
    queue.offer(48);
    queue.offer(60);
    System.out.println(queue);
    System.out.println(queue.poll());
    System.out.println(queue);
    System.out.println(queue.peek());
       
 
    }
}
