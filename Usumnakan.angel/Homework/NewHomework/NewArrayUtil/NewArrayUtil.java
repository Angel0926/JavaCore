package Homework.NewHomework.NewArrayUtil;

public class NewArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 121, 30};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);

        System.out.println();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print(count + " ");

        System.out.println();
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count1++;
            }
        }
        System.out.print(count1 + " ");
        System.out.println();

        double sum = 0;
        double count3 = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            count3++;

        }
        System.out.println(sum / count3);
        System.out.println();


        int sum1 = 0;

        for (int i = 0; i < array.length; i++) {
            sum1 = sum1 + array[i];


        }
        System.out.println(sum1);


    }
}

