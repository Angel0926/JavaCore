package Homework.dinamicArray;

public class DinamicArrayTest {
    public static void main(String[] args) {
        DinamicArray da = new DinamicArray();
        for (int i = 0; i < 20; i++) {
            da.add(i);
        }


        System.out.println(da.getByIndex(25));
      int byIndex = da.getByIndex(6);
        System.out.println(byIndex);
        da.print();
    }
}