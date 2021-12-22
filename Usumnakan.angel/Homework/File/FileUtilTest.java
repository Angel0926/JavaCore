package Homework.File;

import java.io.IOException;
import java.util.Scanner;

public class FileUtilTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        FileUtil fileUtil=new FileUtil();
        System.out.println("Please input txtpath");
        String path=scanner.nextLine();
       // System.out.println("PLease input keyword");
      //  String keyword=scanner.nextLine();
        System.out.println("Please input filename");
        String filename=scanner.nextLine();
        System.out.println("Please input content");
        String content=scanner.nextLine();
       // fileUtil.findLines(path, keyword);
       // fileUtil.printSizeOfPackage(path);
        fileUtil.createFileWithContent(path,filename,content);

    }
}
