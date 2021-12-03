package Homework.classHW;

public class FigurePainterclass {
    void figure1() {
        for (int i = 4; i > 0; i--) {
            for (int j = 4; j > i - 1; j--) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void figure2() {
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void figure3() {
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void figure4() {
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();


        }
    }

    void figure5() {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
        }
    }
}
