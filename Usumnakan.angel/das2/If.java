package das2;

import sun.awt.geom.AreaOp;

import java.sql.SQLOutput;

public class If {
    public static void main(String[] args) {
        int x, y;
        x = 5;
        y = 20;
        if (x < y) System.out.println("x poqr e y");
        x = x * 2;
        if (x == y) System.out.println("x havasar e y");
        x = x * 2;
        if (x > y) System.out.println("x mec  e y");
        if (x == y) System.out.println("vochinch");
    }
}
