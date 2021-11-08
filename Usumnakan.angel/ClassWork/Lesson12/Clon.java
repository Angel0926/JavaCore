package ClassWork.Lesson12;

public class Clon {
    double width;
    double height;
    double depth;

    Clon(Clon ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Clon(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Clon() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Clon(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class OverCLon {
    public static void main(String[] args) {
        Clon mybox1 = new Clon(10, 20, 15);
        Clon mybox2 = new Clon();
        Clon mycube = new Clon(7);
        Clon myClone = new Clon(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Oбъeм myboxl равен " + vol);
        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен" + vol);
        vol = mycube.volume();
        System.out.println("Oбъeм куба равен " + vol);
        vol = myClone.volume();
        System.out.println("Oбъeм клона равен " + vol);
    }
}