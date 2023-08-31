public class Stringlen {

    public static void printLetters(String str ){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // String fullName = "tony Stark";
        // System.out.println(fullName.length());

        //Concentation of String

        String firstName = "Rishabh";
        String lastName = "Shukla";
        String str = firstName + " " + lastName;
        printLetters(str);
    }
}
