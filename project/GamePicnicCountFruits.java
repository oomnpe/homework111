package gb.intermediate.project;

import gb.intermediate.example.Kit;

/**
 * показываем количество фруктов в кнаборе
 */
public class GamePicnicCountFruits implements Calculate<Kit> {

    @Override
    public void calculate(Kit kit) {
        System.out.printf("Всего фруктов - %s%n", kit.getKitSize());
    }

}