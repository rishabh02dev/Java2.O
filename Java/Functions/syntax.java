import java.util.Scanner;

public class syntax {

    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello");
        System.out.println("world");
    }

    public static int calculateSum(int a , int b){
        int sum = a+b;
        return sum;

    }

    public static int factorial(int n){
        int fact =1;
        for(int i = 1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // printHelloWorld(); //function call
        // Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int sums = calculateSum(num1,num2);
        // System.out.println("Sum is " + sums);

        System.out.println(factorial(4));

    };
}
