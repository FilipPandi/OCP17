package ocp.exame.iteration.exercise.model;

import java.math.BigDecimal;

public class ObjectB {

    private String name;
    private BigDecimal price;
    private ObjectB2 objectB2;

    public ObjectB(String name, BigDecimal price, ObjectB2 objectB2) {
        this.name = name;
        this.price = price;
        this.objectB2 = objectB2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ObjectB2 getObjectB2() {
        return objectB2;
    }

    public void setObjectB2(ObjectB2 objectB2) {
        this.objectB2 = objectB2;
    }

    @Override
    public String toString() {
        return "ObjektB{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", objectB2=" + objectB2 +
                '}';
    }
}
