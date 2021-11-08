package Homework.NewHomework.NewPracticeHomework;

import Homework.PracticeHomework.PracticeHomework;

public class NewPracticeArrayTest {
    public static void main(String[] args) {
        PracticeHomework ph=new PracticeHomework();
        System.out.println(ph.calcAge(2));
        System.out.println(ph.lessThanOrEqualToZero(5));
        System.out.println(ph.nextNumber(8));
        System.out.println(ph.isSameNum(3, 4));
        System.out.println(ph.maxLength(new int[]{4, 5, 7}, new int[]{8, 9, 6, 4, 2}));
        System.out.println(ph.reverseBool(false));
    }
}
