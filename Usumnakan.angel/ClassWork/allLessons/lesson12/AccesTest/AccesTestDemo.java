package ClassWork.allLessons.lesson12.AccesTest;

public class AccesTestDemo {
        public static void main(String args[]){
     AccessTest ob = new AccessTest();
        ob.a=10;
        ob.b=20;
        ob.setc(100);
System.out.println("a, b, и с: " + ob.a + " "
                + ob.b + " " + ob.getc());
    }

}
