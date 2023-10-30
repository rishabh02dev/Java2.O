public class hierarchialinheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.mamals();
        dobby.animals();
        dobby.fly();
        System.out.println();

    }
}

class Animal{
    void animals(){
        System.out.println("animals");
    }
}

class mamals extends Animal{
    void ninja(){
        System.out.println("They are warm blooded");
    }
}

class fish extends Animal {
    void fly(){
        System.out.println("Fishes");
    }
}

class birds extends Animal{
    void walk(){
        System.out.println("They can fly");
    }
}
