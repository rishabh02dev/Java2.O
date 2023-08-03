import java.util.Scanner;

public class Messi_Ronaldo {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int Messi = (2 * a + 1 * b);
        int Ronaldo = (2 * x + 1 * y);
        if (Messi > Ronaldo) {
            System.out.println("Messi");
        } else if (Messi == Ronaldo) {
            System.out.println("Equal");
        } else {
            System.out.println("Ronaldo");
        }
    }
}
