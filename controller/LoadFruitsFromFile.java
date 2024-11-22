package gb.intermediate.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LoadFruitsFromFile {
    private String fileName;

    public LoadFruitsFromFile(String fileName) {
        this.fileName = fileName;
    }

    public List<String> getRawFruits() {
        List<String> fruitsList = new ArrayList<>();
        try {
            // Чтение всего содержимого файла в строку
            String content = new String(Files.readAllBytes(Paths.get(fileName)));

            // Разделение строки на слова по пробелам
            String[] fruitsArray = content.split("\\s+");

            // Добавляем каждое слово в список
            for (String fruit : fruitsArray) {
                fruitsList.add(fruit);
            }

        } catch (IOException e) {
            e.printStackTrace(); // Обработка ошибок
        }

        return fruitsList;
    }
}


