public class moverriding {
    public static void main(String[] args) {
        deer d = new deer();
        d.eat();
         d.eat();

        Animal a = new Animal();
        a.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eat anything");
    }
}

class deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}