public class oops1 {

    public static void main(String[] args) {
        Pen p1 = new Pen(); //created an object for the pen so that it have space in the heap

        p1.setColor("blue");
        System.out.println(p1.getColor());
        // System.out.println(p1.color);

        p1.setTip(25);

        System.out.println(p1.getTip());

        p1.setColor("black");
        System.out.println(p1.getColor());

        // p1.color  = "Yellow";
        // System.out.println(p1.color);

        //Access Modifier
        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "Rishabh02dev";
        // myAcc.password = "rishabh02";
        // System.out.println(myAcc.password);
        // System.out.println(myAcc.username);
    }

}
    class Pen{
        private String color;
        private int tip;

        String getColor(){
            return this.color;
        }
    
        int getTip(){
            return this.tip;

        }
        void setColor(String newColor){
            color = newColor;
        }
    
        void setTip(int newTip){
            tip = newTip;
        }
    }



    class BankAccount{

        public String username;
        public String password;
        public void setPassword(String pwd){
            password = pwd;
        }
    
    }



    class Student{
        String name;
        int age;
        float percentage;

        void calcPercentage(int phy, int chem, int math){
            percentage = (phy+chem+math)/3;
        }
    }

