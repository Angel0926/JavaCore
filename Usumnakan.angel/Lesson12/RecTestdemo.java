package Lesson12;

public class RecTestdemo {
        public static void main(String args[]) {

            RecTest ob = new RecTest(10);
            int i;
            for (i = 0; i < 10; i++)
                ob.values[i] = i;
            //  ob.printArray(10);
            System.out.println(ob.values[5]);
        }
}
