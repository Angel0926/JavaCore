package Homework.DinamicArray;

public class DinamicArray {
    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա -> կանչել extend() մեթոդ
    //և ավելացնենք
    public void add(int value) {
        if (array.length==size) {
            extend();
        }
            array[size++] = value;
    }


    //1.ստեղծել հին մասիվից 10  էլեմոնտ ավելի մեծ մասիվ լենգտհ+10
//2. պետք է գցել հին մասիվի էլեմենտները նորի մեջ առռայֆոռով լսնել նորի մեջ
//3. հին մասիվի հղումը կապել նոր մասիվի հղման հետ array-nor masiv
    private void extend() {
        int[] result = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        array = result;
    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է
// //վերադարձնել մասիվ  index-երորդ էլեմենտը: հակառակ դեպքում վերադարձնել -1: sout indeqsy durs e masivi indexic 0 kam index>
    public int getByIndex(int index) {
        if (index < 0 || index > array.length) {
            return -1;
        } else return array[index];
    }

    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}