package Lesson12;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
    ob.test();
    ob.test(10);
    ob.test(10,20);
    result = ob.test(123.25);
        System.out.println(
                "Результат вызова ob.test(123.25): " + result);

        OverloadDemo obv=new OverloadDemo();
        int i =88;
        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(123.2);

    }
}
