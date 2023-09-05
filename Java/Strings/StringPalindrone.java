public class StringPalindrone {

    public static boolean CheckPalindrone(String str){
        for(int i = 0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racesar";
        System.out.println(CheckPalindrone(str));
    }
}
 