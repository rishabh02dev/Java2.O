public class functionoverloadingusingdatatype {

    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,6));
        System.out.println(sum(1.2f,0.8f));
        System.out.println(sum(2.2,4.5));
    }

}
