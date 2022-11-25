package ocp.exame.iteration.exercise.model;

public class ObjectB2 {
    private Integer nubmer;
    private String year;

    public ObjectB2(Integer nubmer, String year) {
        this.nubmer = nubmer;
        this.year = year;
    }

    public Integer getNubmer() {
        return nubmer;
    }

    public void setNubmer(Integer nubmer) {
        this.nubmer = nubmer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "ObjectB2{" +
                "nubmer=" + nubmer +
                ", year='" + year + '\'' +
                '}';
    }
}
