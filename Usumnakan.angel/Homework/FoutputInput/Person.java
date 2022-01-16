package Homework.FoutputInput;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -9099397179183008584L;
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId_() {
        return id;
    }

    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", name='" + name + '\'';
    }
}
