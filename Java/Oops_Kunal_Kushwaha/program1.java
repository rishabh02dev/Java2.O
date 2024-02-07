public class program1{
    public static void main(String[] args) {
        Student student1 = new Student(23, "rishuu" , 244);
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
    }
}

class Student{
    int rno;
    String name;
    float marks;


    Student(){
        this.name = "Rishabh Shukla";
        this.rno = 23;
        this.marks = 100;
    }

    Student(int rno, String name, int marks){
        this.marks = marks;
        this.rno = rno;
        this.name = name;
    }
}