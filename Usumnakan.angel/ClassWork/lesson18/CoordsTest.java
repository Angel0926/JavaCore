package ClassWork.lesson18;

import javax.swing.plaf.TableHeaderUI;

public class CoordsTest {
    public static void main(String[] args) {
        TwoD t1 = new TwoD(1,2);
        TwoD t2 = new TwoD(5,6);
        TwoD t3 = new TwoD(11,2);
        TwoD t4 = new TwoD(5,66);
        TwoD[] a = {t1,t2};
        TwoD[] b = {t3,t4};
        Coords<TwoD> coord = new Coords<>(a);
        Coords<TwoD> coords = new Coords<>(b);
        Coords.showXY(coords);
        Coords.showXY(coord);

        ThreeD th1 = new ThreeD(150,225,30);
        ThreeD[] ths = {th1};

        Coords<ThreeD> co = new Coords<>(ths);

        Coords.showXYZ(co);



    }


    }

