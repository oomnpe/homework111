package gb.intermediate.project;

import gb.intermediate.model.Kit;

/**
 * показываем количество фруктов в кнаборе
 */
public class GamePicnicCountFruits implements Calculate<Kit> {

    @Override
    public void calculate(kit kit) {
        System.out.printf("Всего фруктов - %s%n", kit.getKitSize());
    }
}