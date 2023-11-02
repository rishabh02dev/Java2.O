public class thiskeyword {
    public static void main(String[] args) {
        Bear h = new Bear();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor is called");
    }
}

class Bear extends Animal{

    Bear(){
        super.color = "Brown"; //this is bydefault called by the child constructor
        System.out.println("Bear constructor is called");
    }
}