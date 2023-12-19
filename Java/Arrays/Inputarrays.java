import java.util.Arrays;
import java.util.Scanner;

public class Inputarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
    
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }

        // System.out.print(Arrays.toString(arr));

        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }

        //arrays of object

        String[] str = new String[4];
        for(int i =0; i<str.length; i++){
            str[i] = sc.next();
        }
        System.out.print(Arrays.toString(str));
    }
}
