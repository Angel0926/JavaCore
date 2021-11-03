package Homework.PracticeHomework;

public class PracticeHomework {
    long convert(int minutes) {
        return minutes * 60;
    }

   public  int calcAge(int years) {
        return years * 365;
    }

   public int nextNumber(int number) {
        return number + 1;
    }

  public  boolean isSameNum(int a, int b) {
        if (a == b) return true;
        else return false;
    }

  public  boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) return true;
        else return false;
    }

   public boolean reverseBool(boolean value) {

        return !value;
    }

  public  int maxLength(int[] array1, int[] array2) {
        if (array1.length > array2.length)
            return array1.length;
        else return array2.length;
    }

}