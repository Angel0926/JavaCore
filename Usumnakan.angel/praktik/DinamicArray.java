package praktik;

public class DinamicArray {
    int[] array=new int[10];
    int size=0;

    public void add(int value){
        if(size==array.length)
            extend();
        array[size++]=value;
    }

    public void extend(){
        int[] result =new int[array.length+10];
        for (int i = 0; i < array.length; i++) {
            result[i]=array[i];
        }
        array=result;
    }


}
