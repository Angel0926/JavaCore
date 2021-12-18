package ClassWork.allLessons.lesson17;

import praktik.Apple;

public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(praktik.Apple.JONATHAN.getPrice());
        System.out.println("cena");
        for (praktik.Apple a : Apple.values()) {
            System.out.println(a +" "+ a.getPrice());

        }
    }
}
