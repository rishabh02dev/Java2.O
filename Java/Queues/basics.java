
import java.util.ArrayDeque;
import java.util.Queue;

public class basics {
    public static void main(String[] args) {
        Queue<Integer> qt = new ArrayDeque<>();
        qt.add(1); //This is used to add in the queue.
        qt.add(2);
        qt.add(3);
        qt.add(4);
        qt.add(5);
        System.out.println(qt);
        qt.remove();  //This is used to remove in the queue. 
        System.out.println(qt);
        qt.add(5); // or we can used qt.poll();
        System.out.println(qt);
        qt.remove();
        System.out.println(qt);
        qt.peek();
        System.out.println(qt.peek());
    }
}
