package gb.intermediate.project;

import gb.intermediate.model.Kit;
import gb.intermediate.model.Fruits;
import gb.intermediate.model.FruitComparator;

import java.util.Optional;

/**
 * Класс для вывода самого длинного названия фрукта в корзине
 */
public class CGamePicnicLongFruitName implements Calculate<Kit>{

    @Override
    public void calculate(Kit kit) {
        Optional<Fruits> maxFruit = kit.getKit().keySet().stream().max(new FruitsComparator());
        System.out.printf("Самое длинное название - %s, его длина %s символов%n", maxFruit.get().getName(),maxFruit.get().getNameLength());
    }
}