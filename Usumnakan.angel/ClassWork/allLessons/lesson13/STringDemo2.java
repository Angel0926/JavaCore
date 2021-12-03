package ClassWork.allLessons.lesson13;

public class STringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "Pervaya Stroka";
        String strOb2 = "Vtoraya Stroka";
        String strOb3 = strOb1;
        System.out.println("Dlina stroki strob1: " + strOb1.length());
        System.out.println("Simvol po indeksy 3 " + "v stroke strob1: " + strOb1.charAt(3));
        if (strOb1.equals(strOb2))
            System.out.println("ob1==ob2");
        else System.out.println("ob1!=ob2");
        if (strOb1.equals(strOb3))
            System.out.println("ob1==ob3");
        else System.out.println("ob1!=ob3");

    }
}
