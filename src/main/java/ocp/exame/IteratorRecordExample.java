package ocp.exame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.*; //WILDCARD (*)

public class IteratorRecordExample {

    private record Fruit(String name, String type) {
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
        Collection<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana",  "Tropical"));
        fruits.add(new Fruit("Apple",  "Common"));
        fruits.add(new Fruit("Orange",  "Citrus"));


        return fruits;
    }
}
