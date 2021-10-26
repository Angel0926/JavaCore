package Homework.ClassHW;

public class ArrayUtilclass {
    int[] array = {5, 26, 38, 14, 50, 4, 18, 32, 1, 7};

    void array1() {
        //Տպեք մասիվի բոլոր էլեմենտները
        System.out.print("1.ARRAY= {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println("}");

    }

    void array2() {
        //  Տպեք մասիվի ամենամեծ թիվը
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("2.Max i=" + max);

    }

    void array3() {
        //Տպեք մասիվի ամենափոքրը թիվը
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("3.Min i=" + min);
    }

    void array4() {
        //Տպեք մասիվի բոլոր զույգ էլեմենտները
        System.out.print("4.ARRAYzuyg= {");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(" " + array[i] + " ");
            }
        }
        System.out.println("}");

    }

    void array5() {
        //Տպեք մասիվի բոլոր կենտ էլեմենտները
        System.out.print("5.ARRAYkent= {");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(" " + array[i] + " ");
            }
        }
        System.out.println("}");
    }

    void array6(){
        //Տպեք զույգերի քանակը
        System.out.print("6.COUNTzuyg= {");
        int index = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {

                index++;
            }
        }
        System.out.print(" " + index + " ");
        System.out.println("}");
    }

    void array7(){
        //Տպեք կենտերի քանակը
        System.out.print("7.COUNTkent= {");
        int index1 = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {

                index1++;
            }
        }
        System.out.print(" " + index1 + " ");
        System.out.println("}");
    }

void array8(){
    //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
    System.out.print("8.Average= {");
    double sum = 0;
    double count = 0;
    for (int i = 0; i < array.length; i++) {

        sum = sum + array[i];

        count++;
    }

    System.out.print(" " + sum / count + " ");
    System.out.println("}");}

    void array9(){
// Տպեք մասիվի էլեմենտների գումարը
        System.out.print("9.SUM= {");
        int sum1 = 0;

        for (int i = 0; i < array.length; i++) {

            sum1 = sum1 + array[i];

        }

        System.out.print(" " + sum1 + " ");
        System.out.println("}");


    }



    }





