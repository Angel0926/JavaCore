package ClassWork.lesson18;

public class NonGen {
    Object ob;
    NonGen(Object o){
        ob=o;
    }
    Object getOb(){
        return ob;
    }
    void showType(){
        System.out.println(ob.getClass().getName());
    }
}
