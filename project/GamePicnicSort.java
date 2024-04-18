package gb.intermediate.project;

import gb.intermediate.model.Kit;
import gb.intermediate.model.Fruits;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;


/**
 * сортировка содержимого в наборе
 */
public class GamePicnicSort implements Calculate<Kit> {
    private static boolean ascending = false;

    public GamePicnicSort() {
    }

    public GamePicnicSort(boolean ascending) {GamePicnicSort.ascending = ascending;}

    @Override
    public void calculate(Kit kit) {
        Map<Fruits, Integer> sorted = sortKit(kit);
        for (Fruits fruit: sorted.keySet()) {
            System.out.printf("'%s' = %s%n",fruit.getName(),kit.getPlantAmount(fruit));
        }

    }
    private Map<Fruits, Integer> sortKit(Kit<Fruits> kit){
        Map<Fruits, Integer> sorted = kit.getKit();

        if (!ascending) {
            sorted = sorted
                    .entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(
                            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        } else {
            sorted = sorted
                    .entrySet()
                    .stream()
                    .sorted(comparingByValue())
                    .collect(
                            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        }
        return sorted;
    }
    public static void setAscending(boolean ascending){ GamePicnicSort.ascending = ascending;}
}