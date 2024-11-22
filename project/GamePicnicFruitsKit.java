package gb.intermediate.project;

import gb.intermediate.example.FruitsKit;
import gb.intermediate.example.Kit;
import gb.intermediate.example.Fruits;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для вывода набора
 */
public class GamePicnicFruitsKit implements Calculate<Kit> {
    @Override
    public void calculate(Kit kit) {
        List<String> allFruits = getGamePicnicFruitskit(kit);
        for (String fruit: allFruits) System.out.println(fruit);

    }


    private List<String> getGamePicnicFruitskit(Kit<Fruits> kit) {
        List<String> result = new ArrayList<>();
        for (Fruits fruit : kit) {
            //    System.out.println(fruit.getName() + "   ");
            FruitsKit basket = new FruitsKit();
            result.add(String.format("%s - %s шт.", fruit.getName(), kit.getPlantAmount(fruit)));

        }
        return result;
    }
}