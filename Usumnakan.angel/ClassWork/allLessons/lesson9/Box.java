package ClassWork.allLessons.lesson9;

public class Box {
    double width;
    double height;
    double depth;
/*void volume(){
        System.out.println("volume");
        System.out.println(width * height * depth);
*/

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
