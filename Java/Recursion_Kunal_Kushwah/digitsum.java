public class digitsum {
    public static void main(String[] args) {
        int result = digitsum(1342);
        System.out.println(result);
    }

    static int digitsum(int n){

        if(n==0){
            return 0;
        }

        return (n%10) + digitsum(n/10);
    }
}
