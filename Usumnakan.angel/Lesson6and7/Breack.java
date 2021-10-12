package Lesson6and7;

public class Breack {

    public static void main(String args[]) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Предшествует оператору break.");
                    if (t) break second;
                    System.out.println("Этот оператор не будет выполняться");}
                    System.out.println("Этот оператор не будет выполняться");}
                    System.out.println("Этот оператор следует за блоком second.");
                }
            }
        }
