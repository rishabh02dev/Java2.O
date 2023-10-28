public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.color = "red";
        shark.fish = 23;
        System.out.println(shark.color);
        System.out.println(shark.fish);

    }
}


//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    int fish;

    void swim(){
        System.out.println("Swims in water");
    }
}

