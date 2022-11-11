package ocp.exame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorRecordExample {

    private record Fruit(String name, String type) {
        Fruit(String name, String type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public String toString() {
            return "Fruit{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Collection<Fruit> listOfFruits = toList();
        Iterator<Fruit> iterator = listOfFruits.iterator();

        System.out.println("List = " + listOfFruits);
        while (iterator.hasNext()) {
            System.out.println("Fruit name = " + (iterator.next().name));
        }
    }

    private static Collection<Fruit> toList() {
        Collection<Fruit> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Fruit("Banana",  "Tropical"));
        listOfAnimals.add(new Fruit("Apple",  "Common"));
        listOfAnimals.add(new Fruit("Orange",  "Citrus"));


        return listOfAnimals;
    }
}
