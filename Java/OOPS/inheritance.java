public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.color = "red";
        shark.fish = 23;
        System.out.println(shark.color);
        System.out.println(shark.fish);

        Mahibalipuram Grand = new Mahibalipuram();
        Grand.place1();
        Grand.place2();
        Grand.place();
        Grand.places();
        Grand.mahabali = "Mahablipuram";
        System.out.println(Grand.mahabali);
        

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

class Chennai{
    String famous_places;
    void place1(){
        System.out.println("Marina Beach");
    }
    
    void place2(){
        System.out.println("Santhome Basilica Church");
    }
    void place3(){
        System.out.println("Light house Chennai");
    }
}

class Mahibalipuram extends Chennai{
    String mahabali;
    void place(){
        System.out.println("Shore Temple");
    }

    void places(){
        System.out.println("Beach Mahabalipuram");
    }
}

