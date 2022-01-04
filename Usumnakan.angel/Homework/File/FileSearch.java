package Homework.File;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input path");
        String path = scanner.nextLine();
        System.out.println("please input fileName");
        String fileName = scanner.nextLine();
        fileSearch(path, fileName);
    }


    private static void fileSearch(String path, String fileName) {
            boolean exist = false;
            File file = new File(path);
                if(file.isDirectory()){
                    for (File listFile : file.listFiles()) {
                        fileSearch(listFile.getAbsolutePath(), fileName);
                    }

    }
                if(file.isFile()){
                 if(file.getName().contains(fileName)){
                     System.out.println(file.getAbsolutePath());
                    }
                }

                }

}