package Homework.File;


import java.io.File;
import java.util.Scanner;

public class FileSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input path");
        String path = scanner.nextLine();
        System.out.println("please input filename");
        String fileName = scanner.nextLine();
        search(path,fileName);

    }
    private static void search(String path, String fileName) {
        boolean exists = false;
        File file=new File(path);
        if(file.isDirectory()){
            File[] files=file.listFiles();
            for (File file1 : files) {
             search(file1.getPath(), fileName);
             if(file1.getName().equalsIgnoreCase(fileName)){
                 exists = true;
             }System.out.println(exists);
            }
        }

    }
}
