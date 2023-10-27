import java.util.Scanner;

public class revisingfunctions{

    public static void sayHello(){
        System.out.println("Namaste duniyaa");
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int doubleValue(int a) {  
        return a * 2;  
      }  
    
    public static void printname(String lastname){
        System.out.println("THe whole name is Rahana " + lastname);
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int addition(int x, int y){
        return x+y;
    }

    public static double addition(double x , double y){
        return x+y;
    }

    public static void votes(int age){
        if(age>18){
            System.out.println("You can vote");
        }
        else System.out.println("No you can't vote");
        
    }
    
    
    public static void main(String[] args) {
        System.out.println(sum(12, 12));
        votes(24);
        int phla = add(12, 12);
        System.out.println(phla);
        double dusra = addition(12, 12);
        System.out.println(dusra);
        


        
        
    }
}