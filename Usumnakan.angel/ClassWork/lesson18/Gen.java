package ClassWork.lesson18;

public class Gen<T> {
    Gen(T o){
        ob=o;
    }
    T ob;

    T getobject(){
        return ob;
    }

    void showType(){
        System.out.println(ob.getClass().getName());
    }

}
