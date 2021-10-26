package Praktik;


public class hw1 {
    public static void main(String[] args) {
     Karam axjik= new Karam();
     Karam txa= new Karam();
     axjik.age=17;
     txa.age=19;
     axjik.name="Ani";
     txa.name= "Aram";
     axjik.neymik();
     txa.neymik();

    }
}

class Karam{
    String name;
    int age;

    void neymik(){
        System.out.println( "my name is" + name + age + "y o" );
    }


}