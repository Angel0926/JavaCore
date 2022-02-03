package ClassWork.allLessons.lesson1;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;

public class HJBB {
    public static void main(String[] args) {
        String path="C:\\Users\\User\\Desktop\\khhj.txt";
        File file=new File(path);
        int k;
        System.out.println(file.isFile());
    }
}
