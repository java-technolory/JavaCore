package mta.edu.vn.constructor;

import java.util.ArrayList;
import java.util.List;

public class Fruits {

    private List<String> fruitsList;

    public Fruits(List<String> fruitsList) {
        this.fruitsList = fruitsList;
    }

    public Fruits(Fruits fruits) {
        List<String> list = new ArrayList<>();
        for (String str : fruits.getFruitsList()) {
            list.add(str);
        }
        this.fruitsList = list;
    }

    public List<String> getFruitsList() {
        return this.fruitsList;
    }

    public void setFruitsList(List<String> fruitsList) {
        this.fruitsList = fruitsList;
    }

}
