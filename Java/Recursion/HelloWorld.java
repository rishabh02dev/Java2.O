import java.util.Scanner;

class HelloWorld {
    public static int fact(int n){
      if(n==0){
        return 1;
      }else{
        return fact(n-1)*n;
        
      }
    }
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(fact(n));
    }
  }