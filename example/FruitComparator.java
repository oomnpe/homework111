package gb.intermediate.example;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruits> {
    @Override
    public int compare(Fruits o1, Fruits o2) {
        return Integer.compare(o1.getNameLength(),o2.getNameLength());
    }
}