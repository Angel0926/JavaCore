package Lesson10;

public class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Koнcтpyиpoвaниe объекта Вох");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;

    }
}
class BoxDemo6{
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;
        vol = mybox1.volume();
        System.out.println("Oбъeм равен" + vol);
        vol = mybox2.volume();
        System.out.println("Oбъeм равен" + vol);
    }
}