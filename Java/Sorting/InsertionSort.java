import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {
    public static void InsertionSort(Integer arr[]){
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct pos to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void printArr(Integer arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
    public static void main(String[] args) {
        Integer arr[] = {1,3,2,5,4};
        Arrays.sort(arr);

        //if descending order then
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);

    }
    
}
