public class interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Rook r = new Rook();
        r.moves();

        king k = new king();
        k.moves();

        Bear b = new Bear();
        b.eats();
    }
}

interface Herbivore{
    void eats();
}

interface Carnivore{
    void eats();
}

class Bear implements Herbivore, Carnivore{
    public void eats(){
        System.out.println("Bear eats both Herbivorous food and Carnivorous food it is a omnivoruous");
    }
}

interface ChessPlayer{
    void moves();
    //public abstract 
}

class Queen implements ChessPlayer{
    public void moves(){
     System.out.println("up , down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer{

    //public banaya tha parent ne toh public hi rakhaa
    public void moves(){
     System.out.println("up , down, left, right)");
    }
}

class king implements ChessPlayer{
    public void moves(){
     System.out.println("up , down, left, right, diagonal (by 1 step)");
    }
}


