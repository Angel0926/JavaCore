package Homework.education.storage;

import Homework.education.model.Lesson;
import Homework.education.model.Student;
import Homework.education.util.FileUtil;


import java.util.LinkedList;
import java.util.List;

public class StudentStorage {
    List<Student> students = new LinkedList<>();

    public void add(Student student) {
        students.add(student);
        FileUtil.serializeStudent(students);
    }
    public void print() {
        for (Student student : students) {
        System.out.println(student);
        }
    }

    public Student getByEmail(String email) {
        for (Student student : students) {
            if (student.getEmail().equals(email)) {
                return student;
            }
        }
        return null;
    }

    public void printStudentsByLesson(Lesson lesson) {
        for (Student student : students) {
            for (Lesson lesson1 : student.getLessons()) {
                if (lesson1.equals(lesson)) {
                    System.out.println(student);
                }
            }
        }
    }
    public void deleteStudentByEmail(String email) {
        for (Student student : students) {
            if (student.getEmail().equals(email)) {
                remove(student);
                System.out.println("The student's has been deleted");
            }
        }
        FileUtil.serializeStudent(students);
    }
    private void remove(Student student) {

        students.remove(student);
        FileUtil.serializeStudent(students);
    }
    public void initData(){
        List<Student> students = FileUtil.deserializeStudent();
        if(students!=null){
            this.students=students;
        }

    }
}