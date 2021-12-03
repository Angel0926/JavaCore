package ClassWork.allLessons.lesson10;

public class Box1 {
    double width;
    double height;
    double depth;
    Box1(double width, double height, double depth){
       this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume(){
        return width * height * depth;
    }
}

class BoxDemo5{
    public static void main(String[] args) {
        Box1 mybox1= new Box1(10,20,15);
        Box1 mybox2= new Box1(3,6,9);

    double vol;
    vol = mybox1.volume();
        System.out.println("Oбъeм равен" + vol);
        vol = mybox2.volume();
        System.out.println("Oбъeм равен" + vol);
    }

}