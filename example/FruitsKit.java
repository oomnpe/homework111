package gb.intermediate.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FruitsKit implements Kit<Fruits>, Iterable<Fruits> {
    private Map<Fruits, Integer> basket;
    private HashMap kit = new HashMap();

    public FruitsKit() {
        kit = new HashMap<>();
    }

    public FruitsKit(Map<Fruits, Integer> basket) {
        this.kit = (HashMap) basket;
    }

    public FruitsKit(List<String> rawData) {
        kit = new HashMap<>();
        if (rawData == null) {
            System.err.println("Набор пуст.");
            return;
        }
        for (String fruit : rawData) {
            if (!fruit.isEmpty()) {
                addToKit(Fruits.getFruitInstance(fruit));
            }
        }
    }

    public Map<Fruits, Integer> getKit() {
        return kit;
    }

    @Override
    public int getKitSize() {
        return this.kit.size();
    }

    @Override
    public void addToKit(Fruits plant) {
        if (plant == null) throw new RuntimeException(" в наборе должны находиься фрукты");
        int count = (int) this.kit.getOrDefault(plant, 0);
        Integer put = (Integer) kit.put(plant, ++count);

    }

    @Override
    public Integer getPlantAmount(Fruits fruit) {
        return (Integer) kit.get(fruit);
    }


    @Override
    public Iterator<Fruits> iterator() {
        return kit.keySet().iterator();
    }
}