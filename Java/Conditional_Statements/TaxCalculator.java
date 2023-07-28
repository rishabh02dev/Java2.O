import java.util.Scanner;

public class TaxCalculator {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if(income<5000000){
            tax =0;
        }
        else if (income >=500000 && income< 10000000){
            tax = (int)(income*(0.2));
        }
        else{
            tax = (int)(income*(0.3));
        }

        System.out.println("Your is tax " + tax + " dear");
}
}
