package ClassWork.lesson18;

public class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o){
        coords = o;
    }

   static void showXY(Coords<?> c){
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
            System.out.println();

        }
    }
    static void showXYZ(Coords<? extends ThreeD> c){
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y +
                    " " + c.coords[i].z);
            System.out.println();
    }
}
}
