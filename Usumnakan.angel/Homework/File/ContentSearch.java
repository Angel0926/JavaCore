package Homework.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class ContentSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input path");
        String path = scanner.nextLine();
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        contentSearch(path, keyword);
    }

    private static void contentSearch(String path, String keyword) {
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File listFile : Objects.requireNonNull(file.listFiles())) {
                    contentSearch(listFile.getAbsolutePath(), keyword);
                }

            }
            if (file.isFile() && file.getName().endsWith(".txt")) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.contains(keyword)) {
                            System.out.println(line);
                        }
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }}
