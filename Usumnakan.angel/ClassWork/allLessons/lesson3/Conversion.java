package ClassWork.allLessons.lesson3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("int-ic ancum\n 99 byte-i");
        b = (byte) i;
        System.out.println(" i and b " + i + " " + b);
        System.out.println("\n ancum double-ic int-i");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);
        System.out.println("\n double-ic byte-i");
        b = (byte) d;
        System.out.println(" d and b" + d + " " + b);

    }
}
