package Homework.education.storage;

import Homework.education.model.Lesson;
import Homework.education.model.Student;

import java.util.Arrays;

public class StudentStorage {
    private Student[] students = new Student[10];
    private int size;

    public void add(Student student) {
        if (size == students.length) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, size);
        students = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }
        }
        return null;
    }

    public void printStudentsByLesson(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            for(Lesson lesson1:students[i].getLessons()){
            if (lesson1.equals(lesson)) {
                System.out.println(students[i]);
            }
        }
    }}

    public void deleteStudentByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                delete(i);
                System.out.println("The student's has been deleted");
            }
        }
    }

    private void delete(int index) {
        for (int i = index + 1; i < size; i++) {
            students[i - 1] = students[i];
        }
        size--;
    }
}