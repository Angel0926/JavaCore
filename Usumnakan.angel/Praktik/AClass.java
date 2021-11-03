package Praktik;

import Homework.PracticeHomework.PracticeHomework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AClass {
    public static void main(String[] args)
            throws java.io.IOException {

        Scanner scanner = new Scanner(System.in);
        PracticeHomework PH = new PracticeHomework();
        anun:
        for (int i = 0; i < i + 1; i++) {
            System.out.println("input first number");
            int a = scanner.nextInt();
       if(a==(char) a){
           System.out.println("kuku");
           break anun;
       }
            System.out.println("select operation");
            String b = scanner.next();
            switch (b) {
                case "a":
                    System.out.println(PH.calcAge(a));
                    break;
                case "b":
                    System.out.println(PH.nextNumber(a));
                    break;
                case "c":
                    System.out.println(PH.lessThanOrEqualToZero(a));
                    break;
                default:
                    System.out.println("invalid operation");
            }
            anun1:
            for (int j = 0; j < j + 1; j++) {
                System.out.println("to finish press #");
                char c = (char) System.in.read();
                if (c == '#') {
                    return;
                } else System.out.println("error");
                continue;
            }
        }

    }
}


