package Homework.ClassHW;

public class ArrBololaclass {

   void Bolola1() {
       // քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը
       char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
       char c = 'o';
       int count = 0;
       for (int i = 0; i < bolola.length; i++) {
           if (bolola[i] == c) {

               count++;
           }
       }
       System.out.println("1-" + count);
   }

   void Bolola2(){
    //պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները
    char[] bolola1 = {'b', 'o', 'l', 'o', 'l', 'a'};
            for (int j = 0; j < bolola1.length; j++) {
        if (j == bolola1.length / 2) {
            System.out.println("2-" + bolola1[j - 1] + " " + bolola1[j]);
        }
    }}

    void Bolola3(){
        // պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false

        char[] bolola2 = {'b', 'o', 'l', 'o', 'l', 'a'};

        if (bolola2[bolola2.length - 1] == 'y' && bolola2[bolola2.length - 2] == 'l') {
            System.out.println("3-" + true);
        } else System.out.println("3-" + false);
    }


void Bolola4() {
    // Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։

    char[] bolola3 = {'b', 'a', 'b', 'o', 'l', 'a'};
    System.out.print("4-");
    for (int f = 0; f < bolola3.length; f++) {
        if (bolola3[f] != 'b')
            continue;
        if (bolola3[f] == 'b' && bolola3[f + 2] == 'b') {
            System.out.println("true");
            break;
        } else System.out.println("false");
    }
}

void Bolola5(){
    //   Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ, որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev)։
    char[] text = {' ', ' ', 's', ' ', 'b', 'a', 'r', ' ', 'e', 'v', ' ', 's', ' ', ' ', 'n'};
            System.out.print("5-");
    char[] result = new char[text.length];
    int index = 0;
    int i;
            for (i = 0; i < text.length; i++) {
        if (text[i] == ' ')
            continue;
        else if (text[i] != ' ') {
            index++;
            result[index]=text[i];
            break;
        }}
            for (int j = i; j < text.length; j++) {
        if (text[j] == ' ') {
            index++;
            result[index] = text[j];
        }
        else if(text[j]!= ' '){
            index++;
            result[index]=text[j];
        }

        System.out.print(result[index]);
    }

}

}
