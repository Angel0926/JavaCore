package Homework.File;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class ContentSearch {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input path");
        String path = scanner.nextLine();
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("please input text");
            String text = scanner.next();
            for (File listFile : file.listFiles()) {
                if (listFile.getName().endsWith(".txt")){
                    try (BufferedReader reader = new BufferedReader(new FileReader(listFile.getPath()))) {
                        String line="";
                        while((line=reader.readLine())!=null) {
                            if(line.contains(text)){
                        System.out.println(listFile.getName());
                     }
                        }
                    }
                }else System.out.println("");
            }

}}}





