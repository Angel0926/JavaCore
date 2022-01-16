package ClassWork.allLessons.lessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str[]=new String[100];
        System.out.println("vvedite stroki");
        System.out.println("vvedite stop");
        for (int i = 0; i < 100; i++) {
            str[i]=br.readLine();
            if(str[i].equals("stop")) break;
        }
        System.out.println("sod vash fayla:");
        for (int i = 0; i < 100; i++) {
            if(str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }}
