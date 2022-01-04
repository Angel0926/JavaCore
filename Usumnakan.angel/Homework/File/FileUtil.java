package Homework.File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {
    public static void printSizeOfPath(String path) {
        File file = new File(path);
        long size = 0;
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File listFile : file.listFiles()) {
                    size += listFile.length();
                }
                System.out.println((double) size / (1024 * 1024));
            }
        }
    }

    public static void createFileWithContent(String path, String fileName, String content) {
        File file = new File(path + "\\" + fileName + ".txt" );
        try {
            if(file.createNewFile()){
                try(BufferedWriter writer=new BufferedWriter(new FileWriter(file.getAbsolutePath()))){
                    writer.write(content);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
