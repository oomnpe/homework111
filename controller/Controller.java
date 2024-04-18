package gb.intermediate.controller;

import gb.intermediate.model.Kit;
import gb.intermediate.model.Fruits;
import gb.intermediate.model.FruitsKit;
import gb.intermediate.project.*;

/**
 * Контроллер<br>
 * Метод <strong>run()</strong> для запуска приложения
 */
public class Controller {
    private Calculate<Kit> calculate;
    private Kit<Fruits> kit;
    private static final String promptMenu = "1. Перечень фруктов  для пикника%n"+
            "2. Сколько всего фруктов  в наборе%n"+
            "3. Самое длинное название фрукта в наборе%n"+
            "4. Самые популярные фрукты в наборе%n"+
            "5. Самые редкие фрукты в корзине%n"+
            "0. Выход из приложения%n"+
            "Ввведите свой выбор: ";
    private GetChoice getChoice;

    public Controller() {
        basket = new FruitsKit(new LoadFruitsFromFile("input.txt").getRawFruits());
    }

    public void run(){
        int command = 10;
        getChoice = new GetChoice();
        while (command!=0){
            command = getChoice.getIntChoice(promptMenu);
            calculate = switch (command) {
                case 1 -> new GamePicnicFruitsKit();
                case 2 -> new GamePicnicCountFruits();
                case 3 -> new GamePicnicLongFruitName();
                case 4 -> new GamePicnicSort(false);
                case 5 -> new GamePicnicSort(true);
                default -> null;
            };
            if (calculate!=null) calculate.calculate(kit);
        }
        getChoice.close();

    }
}