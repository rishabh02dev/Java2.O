import java.util.Scanner;

public class checkingstringequals {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "TonyStar";
        String s3 = new String("TonyStar");

    
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
