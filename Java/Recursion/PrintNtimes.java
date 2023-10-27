public class PrintNtimes {


    public static void fun(int i , int n){
        if(i>n){
            return ;
        }
        else{
            System.out.println("Rishabh "+ i);
        }

        //function calls to print till i increments n
        fun(i+1, n);
    }
    public static void main(String[] args) {
        int n =3;
        fun(1, n);
    }
}
