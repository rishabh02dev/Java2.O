import java.util.Scanner;

public class Continueinloops {
    public static void main(String[] args) {
        // for(int i = 1; i<=5; i++ ){
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        //Display all the numbers entered by user //except multiples of 10
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Enter the Number");
            int number = sc.nextInt();
            if (number%10 == 0) {
                System.out.println("hello");
                continue;
            }
            System.out.println(number);
        }while(true);
    }
}
