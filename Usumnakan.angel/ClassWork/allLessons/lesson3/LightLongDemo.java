package ClassWork.allLessons.lesson3;

public class LightLongDemo {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.print(days + " օրվա ընթացքում կանցնի ");
        System.out.println(distance + " կիլոմետր");
    }

}
