import java.util.Scanner;

public class whileloop{
    public static void main(String[] args) {
        
        // int counter = 0;
        // while(counter<=100){
        //     System.out.print("Hello World ");
        //     System.out.println(counter);
        //     counter++;
        // }

        //printing a number from 1 to 10
        // int number = 1;
        // while(number<=10){
        //     System.out.print(number + " ");
        //     number++;
        // }

        //Printing numbers from 1 to n
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // int counter = 1;
        // while(counter<=number){
        //     System.out.println("Hello " + counter);
        //     counter++;
        // }

        //Printing the sum of numbers from 1 to n

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum is : " + sum);

    }
}