import java.util.HashSet;
import java.util.Set;

public class LearnLinkedHashset {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(32);
        set.add(42);
        set.add(52);
        set.add(62);
        set.add(72);
        set.remove(72);

        System.out.println(set);
        System.out.println(set.contains(72));
    }
}
