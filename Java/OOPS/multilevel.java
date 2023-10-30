public class multilevel {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.mamals();
        dobby.breathe();
        dobby.color = "Red";
        System.out.println(dobby.color);
    }
}

//Base class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

//First classyfying them as mammal

class Mammal extends Animal{
    int legs;

    void mamals(){
        System.out.println("Mammals are warm blooded");
    }
}

class Dog extends Mammal{
    String breed;

    void dog(){
        System.out.println("This is German Shepherd");
    }

    public void fishes() {
    }

}