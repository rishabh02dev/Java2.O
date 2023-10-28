public class Copyconstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rishabh shukla";
        s1.roll = 123;
        s1.password = "Abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 90;
        Student s2 = new Student(s1);
        s2.password = "efgh";
        s1.marks[2] = 100;
        for(int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
    class Student{

        //shallow copy constructor
        String name;
        int roll;
        String password;
        int marks[];
    
        // Student(Student s1){
        //     marks = new int[3];
        //     this.name = s1.name;
        //     this.roll = s1.roll;
        //     this.marks = s1.marks;
        // }

        //deep copy constructor
        Student(Student s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for(int i =0; i<marks.length; i++){
                this.marks[i] = s1.marks[i];
            }

        }
        Student(){
            marks = new int[3];
            System.out.println("Constructor is called");
        }

        Student(String name){
            this.name = name;
        }

        Student(int roll){
            this.roll = roll;
        }

    }

