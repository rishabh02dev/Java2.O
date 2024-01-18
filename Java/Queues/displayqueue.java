import java.util.ArrayDeque;
import java.util.Queue;

public class displayqueue {
    public static void main(String[] args) {
        Queue<Integer> qt = new ArrayDeque<>();
        qt.add(1); //This is used to add in the queue.
        qt.add(2);
        qt.add(3);
        qt.add(4);
        qt.add(5);
        System.out.println(qt);
        Queue<Integer> helper = new ArrayDeque<>();

        while(!qt.isEmpty()){
            System.out.print(qt.element() + " ");
            int x = qt.poll();
            helper.add(x);
        }

        while(!helper.isEmpty()){
            qt.add(helper.element());
        }

        System.out.println(qt);
        
        
    }
}
