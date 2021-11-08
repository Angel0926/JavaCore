package ClassWork.Lesson3;

public class scope {
    public static void main(String[] args) {
        int x, z; //hasaneli boloruin
        x = 10;
        z = 20;
        if (x == 10) { //nor tiruyt
            int y = 20; //hasaneli e miayn bloki nersum
            System.out.println(" x and y: " + x + " " + y);
            x = y * 2;
        }
        z = 100;
        //x@ hasaneli e nayev aystex
        System.out.println("x havasar e " + x);
        System.out.println(z);
    }
}
