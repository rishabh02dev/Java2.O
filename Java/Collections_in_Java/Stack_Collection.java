import java.util.Queue;
import java.util.Stack;

public class Stack_Collection{
    public static void main(String[] args) {
    
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Horse");
        animals.push("Cat");
        animals.push("Dog");
        
        // System.out.println("Animals are " + animals);

        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());

    }
}    
