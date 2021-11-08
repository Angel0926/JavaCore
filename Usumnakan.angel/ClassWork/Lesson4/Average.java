package ClassWork.Lesson4;

public class Average {
    public static void main(String[] args) {

        double result = 0;
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};

        int i;
        for (i = 0; i < 5; i++) {
            result = result + nums[i];
        }
        System.out.println("MIJIN@ HAVASAR E " + result / 5);
    }
}
