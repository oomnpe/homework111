package gb.intermediate.project;

import gb.intermediate.example.Kit;
import gb.intermediate.example.Fruits;
import gb.intermediate.example.FruitComparator;

import java.util.Optional;

/**
 * Класс для вывода самого длинного названия фрукта в корзине
 */
public class GamePicnicLongFruitName implements Calculate<Kit>{

    @Override
    public void calculate(Kit kit) {
        Optional<Fruits> maxFruit = kit.getKit().keySet().stream().max(new FruitComparator());
        System.out.printf("Самое длинное название - %s, его длина %s символов%n", maxFruit.get().getName(),maxFruit.get().getNameLength());
    }
}