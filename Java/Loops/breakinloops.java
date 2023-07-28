import java.util.Scanner;

public class breakinloops {
    public static void main(String[] args) {
        // for(int i = 1; i<=5; i++){
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println(i);
        // }

        // System.out.println("I'm out of the loop");

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter the number: ");
            int number = sc.nextInt();
            if(number%10 ==0){
                break;
            }
            System.out.println(number);

        }while(true);
        System.out.println("loop ends here because you've entered a multiple a ten");
    }
}
