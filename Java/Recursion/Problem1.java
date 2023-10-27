public class Problem1 {

    static int count =0;

    static void print1(){
        if(count==3){
            return;
        }
        
        else{
            System.out.println(count);
            count++;
        }
        print1();
    }

    public static void main(String[] args) {
        print1();
    }
}


