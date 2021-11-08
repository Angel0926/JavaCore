package ClassWork.Lesson6and7;

public class BreakLoop {
    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Пpoxoд" + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
