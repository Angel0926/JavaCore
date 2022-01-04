package ClassWork.lesson18;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iob;
        iob=new NonGen(88);
        iob.showType();
        int v=(Integer) iob.getOb();
        System.out.println(v);
        System.out.println();
        NonGen strob=new NonGen("text bez ob");
        strob.showType();
        String str=(String) strob.getOb();
        System.out.println(str);
        iob=strob;
        v=(Integer) iob.getOb();
    }
}
