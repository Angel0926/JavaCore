package Homework.PracticeHomework;

import java.sql.SQLOutput;

public class PracticeHomeworkTest {
    public static void main(String[] args){

PracticeHomework PH = new PracticeHomework();
        System.out.println(PH.convert(3));
        System.out.println(PH.calcAge(1));
        System.out.println(PH.nextNumber(6));
        System.out.println(PH.isSameNum(5,3));
        System.out.println(PH.lessThanOrEqualToZero(8));
        System.out.println(PH.reverseBool(true));
        System.out.println(PH.maxLength(new int[5], new int[6]));
    }
}
