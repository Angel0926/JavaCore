package Homework;

public class FigurePainter4 {
    public static void main(String[] args) {

        for (int y = 1; y <=4; y++){
            for (int z = 4; z >y; z--) {
                System.out.print(" ");
            }
            for (int f = 0; f < y; f++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
