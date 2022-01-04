package Homework.File;

import java.util.Scanner;

public class FileUtilTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input path");
        String path= scanner.nextLine();
        //FileUtil.printSizeOfPath(path);
        System.out.println("please input fileName");
        String fileName= scanner.nextLine();
        System.out.println("please input content");
        String content= scanner.nextLine();
        FileUtil.createFileWithContent(path, fileName, content);
    }


}
