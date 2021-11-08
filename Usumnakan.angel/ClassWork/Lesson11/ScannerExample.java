package ClassWork.Lesson11;
import java.util.Scanner;
import ClassWork.Lesson10.Calc.Calculator;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("please input a");
        int a = scanner.nextInt();
        System.out.println("please input b");
        int b = scanner.nextInt();
        System.out.println("please input +, -, *, /");
        String c = scanner.next();
        switch (c) {
            case "+":
                System.out.println(calculator.gumarum(a, b));
                break;
            case "-":
                System.out.println(calculator.hanum(a, b));
                break;
            case "*":
                System.out.println(calculator.bazmapatkum(a, b));
                break;
            case "/":
                System.out.println(calculator.bajanum(a, b));
                break;
            default:
                System.out.println("no symbol");

        }


    }
}
