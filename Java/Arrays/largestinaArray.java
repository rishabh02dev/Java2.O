import java.util.*;
public class largestinaArray {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number from the given array is " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6};
        System.out.println("Largest Number in the given array is " + getLargest(numbers));
    }
}
