import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.plaf.basic.BasicSliderUI.ComponentHandler;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(14);
        list.add(56);
        list.add(45);
        list.add(22);
        list.add(55);
        list.add(66);
        list.add(77);
        // System.out.println("min element "+ Collections.min(list));
        // System.out.println("min element "+ Collections.max(list));
        // System.out.println("min element "+ Collections.frequency(list, 45));

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

    }
}
