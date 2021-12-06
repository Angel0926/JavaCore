package ClassWork.allLessons.lesson15.AB;

public class NestesIFDemo {
    public static void main(String[] args) {
        A.NestedIF nif=new B();
if(nif.isNotNegative(10))
    System.out.println("chislo 10 neotricatelnoe");
if(nif.isNotNegative(-12))
    System.out.println("eto ne budet vivedeno");
    }
}
