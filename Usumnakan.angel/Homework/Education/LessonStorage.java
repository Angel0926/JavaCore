package Homework.Education;


public class LessonStorage {
    private Lesson[] lessons = new Lesson[10];
    private int size;

    public Lesson[] add(Lesson lesson) {
        if (lessons.length == size) {
            extend();
        }
        lessons[size++] = lesson;
        return new Lesson[0];
    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, lessons.length);
        lessons = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }

    public Lesson getByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                return lessons[i];
            }
        }
        return null;
    }


    public void deleteLessonByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                delete(i);
                System.out.println("The lesson's has been deleted");
            }

        }
    }

    private void delete(int index) {
        for (int i = index + 1; i < size; i++) {
            lessons[i - 1] = lessons[i];
        }
        size--;
    }

}

