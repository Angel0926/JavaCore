package ClassWork.allLessons.lesson17;

import java.util.Random;

public enum Apple {
    DEMIRJYAN,
    GOLDEN;

    Random random = new Random();
    int prob = (int) (100*random.nextDouble());

    Apple ap(){
        if(prob < 100){
            return Apple.DEMIRJYAN;
        }
        return null;

    }}


class Testik{
    public static void main(String[] args) {
        Apple ap = Apple.DEMIRJYAN;
    }
}

