package Lesson9;


public class BoxTest {

    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
       double vol;
    /*    mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 6;

        //mybox1.volume();
        // mybox2.volume();
        vol = mybox1.volume();
        System.out.println(vol);
        vol = mybox2.volume();
        System.out.println(vol);*/
        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6,9);
        vol= mybox1.volume();
        System.out.println(vol);
        vol= mybox2.volume();
        System.out.println(vol);
    }
}