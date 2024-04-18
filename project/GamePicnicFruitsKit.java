package gb.intermediate.project;

import gb.intermediate.model.Kit;
import gb.intermediate.model.Fruits;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для вывода набора
 */
public class GamePicnicFruitsKit implements Calculate<Kit> {
    @Override
    public void calculate(BKit kit) {
        List<String> allFruits = getGamePicnicFruitskit(kit);
        for (String fruit: allFruits) System.out.println(fruit);

    }


    private List<String> getGamePicnicFruitskit(Kit<Fruits> kit) {
        List<String> result = new ArrayList<>();
        for (Fruits fruit : kit) {
            result.add(String.format("%s - %s шт.", fruit.getName(), basket.getPlantAmount(fruit)));

        }
        return result;
    }
}