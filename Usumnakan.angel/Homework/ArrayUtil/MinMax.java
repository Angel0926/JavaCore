package Homework.ArrayUtil;

public class MinMax {
    public static void main(String[] args) {

        int[] array= {30,5,20,2,4,10};

        for (int i = 0; i < array.length; i++) {
            for(int j= i+1; j < array.length; j++) {

            int p=array[i];
            if(array[i] > array[j]){
            array[i]=array[j];
            array[j]=p;

           }}

            System.out.print(array[i]+ " ");
    }
        }}








