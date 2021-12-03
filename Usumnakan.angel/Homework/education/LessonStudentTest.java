package Homework.education;

import Homework.education.model.Lesson;
import Homework.education.model.Student;
import Homework.education.storage.LessonStorage;
import Homework.education.storage.StudentStorage;
import Homework.education.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class LessonStudentTest implements LessonStudentCommands {
    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();




    public static void main(String[] args) throws ParseException {
        lessonStorage.add(new Lesson("english", 2, "poxos", 5200));
        lessonStorage.add(new Lesson("french", 3, "dalios", 200));


        boolean isRun = true;
        while (isRun) {
            LessonStudentCommands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    printStudents();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    printLessons();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }

        }

    }

    private static void deleteStudentByEmail() {
        System.out.println("--------");
        studentStorage.print();
        System.out.println("--------");
        System.out.println("please input student's email");
        String email = scanner.nextLine();
        studentStorage.deleteStudentByEmail(email);
    }

    private static void deleteLessonByName() {
        System.out.println("--------");
        lessonStorage.print();
        System.out.println("--------");
        System.out.println("please input lessons name");
        String name = scanner.nextLine();
        lessonStorage.deleteLessonByName(name);
    }

    private static void printLessons() {
        lessonStorage.print();
    }

    private static void printStudentsByLesson() {
        System.out.println("please input lesson's name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLesson(lessonName);
    }

    private static void printStudents() {
        studentStorage.print();
    }

    private static void addStudent() throws ParseException {
        System.out.println("please input  student's name");
        String name = scanner.nextLine();
        System.out.println("please input student's surname");
        String surname = scanner.nextLine();
        System.out.println("please input student's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("please input student's email");
        String email = scanner.nextLine();
        System.out.println("please input student's phone");
        String phone = scanner.nextLine();
        System.out.println("please input registered date //dd/MM/yyyy//");
        String date=scanner.nextLine();
        Date registeredDate = DateUtil.stringToDate(date);
        System.out.println("please input lesson's name");
        String lessonName = scanner.nextLine();
        String[] lessonNames = lessonName.split(",");
        int size=0;
        for (int i = 0; i < lessonNames.length; i++) {
            if(lessonStorage.getByName(lessonNames[i])!=null)
                size++;
        }
        Lesson[] lesson = new Lesson[size];
        for (int i = 0; i < lessonNames.length; i++) {
            if (lessonStorage.getByName(lessonNames[i]) != null) {
                lesson[i] = lessonStorage.getByName(lessonNames[i]);
            }
        }
        Student student = new Student(name, surname, age, email, phone, registeredDate, lesson );
        studentStorage.add(student);
        System.out.println("Thank you, Student was added");

    }

    private static Lesson addLesson() {
        System.out.println("please input lessons's name,duration,lecturer's name,price");
        String lessonDataStr = scanner.nextLine();
        String[] lessonData = lessonDataStr.split(",");
        if (lessonData.length == 4) {
            int duration = Integer.parseInt(lessonData[1]);
            int price = Integer.parseInt(lessonData[3]);
            Lesson lesson = new Lesson(lessonData[0], duration, lessonData[2], price);
            if (lessonStorage.getByName(lesson.getName()) != null) {
                System.err.println("Invalid name. The lesson with this name already exists");
            } else {
                lessonStorage.add(lesson);
                System.out.println("Thank you, lesson was added");
            }
        }
        System.out.println("Invalid lesson");
        return null;
    }
}
