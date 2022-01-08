package Homework.education.model;

import java.io.Serializable;
import java.util.Objects;

public class Lesson implements Serializable{
    private String name;
    private int durationHour;
    private String lecturerName;
    private int price;

    public Lesson(String name, int durationHour, String lecturerName, int price) {
        this.name = name;
        this.durationHour = durationHour;
        this.lecturerName = lecturerName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationHour() {
        return durationHour;
    }

    public void setDurationHour(int durationHour) {
        this.durationHour = durationHour;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return durationHour == lesson.durationHour && price == lesson.price && Objects.equals(name, lesson.name) && Objects.equals(lecturerName, lesson.lecturerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, durationHour, lecturerName, price);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", durationHour=" + durationHour +
                ", lecturerName='" + lecturerName + '\'' +
                ", price=" + price +
                '}';
    }
}
