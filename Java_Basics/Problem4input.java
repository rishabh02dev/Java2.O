import java.util.Scanner;

public class Problem4input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = (3.14*radius*radius);
        System.out.println(area);
    }
}
