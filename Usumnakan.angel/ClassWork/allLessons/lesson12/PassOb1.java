package ClassWork.allLessons.lesson12;

public class PassOb1 {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        Test ob = new Test(15,20);

        System.out.println(ob.a + " " +ob.b);
        ob.meth(ob);
        System.out.println(ob.a + " "+ ob.b);
    }
}
