import java.util.Scanner;

public class findoutvowel {
    public static void findVowel(String str){
        for(int i = 0; i<str.length(); i++){
            if(str.length()>5){
                System.out.println("Password is accepted");
            }else{System.out.println("Password is rejected");}
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scs = sc.next();
        findVowel(scs);

    }
}
