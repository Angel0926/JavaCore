package ClassWork.Lesson14;

public class A {
    int i,j;
        void showij(){
            System.out.println(" i and j: " + i + " " + j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("k: " + k);
    }
    void sum(){
        System.out.println("i+j+jk: " + (i+j+k));
    }
}
class SimpleInheritance{
    public static void main(String[] args) {
        A superOb =new A();
        B subOb=new B();
        superOb.i=10;
        superOb.j=20;
        System.out.println("Sod ob superOb: ");
        superOb.showij();
        System.out.println();
        subOb.i=7;
        subOb.j=8;
        subOb.k=9;
        System.out.println("sod ob subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("sum i,j and k v subOb");
        subOb.sum();
}}
