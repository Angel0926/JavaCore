package ClassWork.lesson18;

public class WildCardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        Integer nums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iobb = new Stats<>(nums);
        double a = iob.average();
        System.out.println("ravno " + v);
        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double w = dob.average();
        System.out.println(w);
        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<>(fnums);
        double x = fob.average();
        System.out.println(x);
        if (iob.sameAvg(iobb))
            System.out.println("ravni");
        else System.out.println("neravni");
        if (iob.sameAvg(fob))
            System.out.println("odinakovi");
        else
            System.out.println("otlichayutsya");

    }
}
