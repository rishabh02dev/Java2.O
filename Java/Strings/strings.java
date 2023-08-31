import java.util.Scanner;

public class strings{
    public static void main(String[] args) {
        String str = "abcd";
        String str2 = new String("xyz");
        System.out.println(str);
        System.out.println(str2);



        //Strings are immutable

        //taking input and output for strings
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();
        System.out.println(name);

        Scanner scs = new Scanner(System.in);
        String arr = scs.nextLine();
        System.out.println(arr);


    }
}