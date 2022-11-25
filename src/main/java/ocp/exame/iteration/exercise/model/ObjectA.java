package ocp.exame.iteration.exercise.model;

import java.util.List;

public class ObjectA {

    private Long id;

    private List<ObjectB> objectBList;

    public ObjectA(Long id, List<ObjectB> objectBList) {
        this.id = id;
        this.objectBList = objectBList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ObjectB> getObjektBList() {
        return objectBList;
    }

    public void setObjektBList(List<ObjectB> objectBList) {
        this.objectBList = objectBList;
    }

    @Override
    public String toString() {
        return "ObjektA{" +
                "Id=" + id +
                ", objektBList=" + objectBList +
                '}';
    }
}
