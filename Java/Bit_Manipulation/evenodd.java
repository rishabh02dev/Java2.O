public class evenodd {

    public static void oddeven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        oddeven(3);
        oddeven(10);
        oddeven(11);
    }
}
