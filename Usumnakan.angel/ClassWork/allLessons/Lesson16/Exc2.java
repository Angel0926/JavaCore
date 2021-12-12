package ClassWork.allLessons.Lesson16;

public class Exc2 {
    public static void main(String[] args) {
        int d,a;
        try{
            d=0;
            a=42/d;
            System.out.println("eto ne budet vivedeno");
        } catch(ArithmeticException e){
            System.out.println("delenie na nul");
        }
        System.out.println("posle operatora catch");


    }
}
