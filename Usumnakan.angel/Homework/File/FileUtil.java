package Homework.File;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

   /* public void findLines(String path, String keyword) throws IOException {
        File file = new File(path);
        if (file.isDirectory()) {
            for (File listFile : file.listFiles()) {
                findLines(listFile.getPath(), keyword);
            }
        }
        try(BufferedReader reader=new BufferedReader(new FileReader(path))){
        String line="";
        while((line=reader.readLine())!=null){
            if(line.contains(keyword)){
                System.out.println(line);
            }else System.out.println();
            }}
        
    public void printSizeOfPackage(String path) {
        int f = 0;
        File file = new File(path);
        if (file.isDirectory()) {
            for (File listFile : file.listFiles()) {
               f+= listFile.length();
            }
            System.out.println(f/1024);
        }
    }*/

   public void createFileWithContent(String path, String filename, String content) throws IOException {
       File file = new File(path);
       if ( file.createNewFile()) {
           try(BufferedWriter writer=new BufferedWriter(new FileWriter(file.getAbsolutePath()))){
              writer.write(content);
               System.out.println("content add");
               }catch (FileNotFoundException e){
               System.out.println(e.getMessage());}
         }
       }

    }

