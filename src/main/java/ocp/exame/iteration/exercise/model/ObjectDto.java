package ocp.exame.iteration.exercise.model;

public class ObjectDto {

    private Long id;

    private ObjectB2 objectB2;

    public ObjectDto(Long id) {
        this.id = id;
    }

    public ObjectDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ObjectB2 getObjectB2() {
        return objectB2;
    }

    public void setObjectB2(ObjectB2 objectB2) {
        this.objectB2 = objectB2;
    }

    @Override
    public String toString() {
        return "ObjectDto{" +
                "id=" + id +
                ", objectB2=" + objectB2 +
                '}';
    }
}
