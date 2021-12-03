package Homework.newHomework.NewCharArray;

public class NewCharArray {
    public static void main(String[] args) {
 /*     char[] bolola = {'b', 'o', 'l', 'i', 'l', 'a'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                count++;
            }

        }
        System.out.println(count);

        System.out.println();

        int merge = 0;
        char[] bolola1 = {'b', 'o', 'l', 'o', 'l', 'o'};
        for (int i = 0; i < bolola1.length; i++) {
            merge = bolola1.length / 2;
            if (i == merge) {
                System.out.println(bolola1[merge - 1] + " " + bolola1[merge]);
            }
        }
        System.out.println();


boolean index=false;
        char[] bolola2 = {'b', 'o', 'l', 'o', 'l','y'};
            if (bolola2[bolola2.length-2] == 'l' && bolola2[bolola2.length-1] == 'y') {
               index=true;
                System.out.println(index);
        }
else System.out.println(index);
    }
}
        boolean index=false520000000;
            char[] bolola3 = {'b', 'o', 'l', 'i', 'l', 'a'};
        for (int i = bolola3.length; i < bolola3.length-2 ; i--) {
            if(bolola3[i]=='b' && bolola3[i+2]=='b'){
            index=true;

            }
        } System.out.println(index);
        System.out.println();
/*


  */

        char[] text = {'l', ' ', ' ', ' ', 'b', 'a', 'r', ' ', 'e', 'v', ' ', ' ', ' ', ' '};
        int startindex = 0;
        int endindex = text.length;
        for (int i = 0; i < text.length; i++) {
            if (text[i] == ' ') {
                startindex++;
            } else break;

        }
        System.out.println(startindex);
        for (int i = text.length - 1; i > 0; i--) {
            if (text[i] == ' ') {
                endindex--;
            } else break;
        }
        System.out.println(endindex);
char[] result = new char[(endindex-startindex)];
int index=0;
        for (int i = startindex; i < endindex; i++) {
          result[index++]=text[i];}


        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i]+" ");
    }
        }
    }




