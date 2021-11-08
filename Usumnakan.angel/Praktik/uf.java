package Praktik;

public class uf {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 66, 78, 41, 52, 54, 7, 5, 9, 65, 4, 5};
        double odd = 0;
        double par = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                par = par + array[i];
            } else odd = odd + array[i];
        }
double f=par%odd;
        System.out.println(f);
    }
    }
