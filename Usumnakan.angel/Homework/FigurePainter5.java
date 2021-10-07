package Homework;

public class FigurePainter5 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for(int j=4; j>=0; j--) {
                if(j>i)
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for(int j=0; j<5; j++) {
                if(j>i)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
