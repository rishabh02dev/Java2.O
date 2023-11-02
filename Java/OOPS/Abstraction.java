public class Abstraction {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
    }
}

abstract class Animal {
    String color;
    Animal(){
       System.out.println("Animal Constructor called");
    }

    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor called");
    }

    
    void ChangeColor(){
        color = "Dark brown";
    }

    
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{

    void ChangeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
}