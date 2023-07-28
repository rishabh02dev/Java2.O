public class product {

    public static int multiply(int a, int b) {
        int product = (a * b);
        return product;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        // int a = 5;
        // int b = 3;
        // int product = multiply(a,b);
        // System.out.println(product);
        int a = 10;
        int b = 5;
        swap(a,b);
        System.out.println("A is " + a);
        System.out.println("B is " + b);
    }
}