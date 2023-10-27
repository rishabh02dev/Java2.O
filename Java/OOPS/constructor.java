public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Rishabh shukla");
        System.out.println(s1.name);
    }
}

    class Student{
        String name;
        int roll;


        // Student(){
        //     System.out.println("Constructor is called");
        // }

        Student(String name){
            this.name = name;
        }
    }

