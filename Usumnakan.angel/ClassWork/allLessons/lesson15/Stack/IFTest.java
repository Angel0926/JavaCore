package ClassWork.allLessons.lesson15.Stack;

public class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);
        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
            for (int j = 0; j < 8; j++) {
                mystack2.push(i);
                System.out.println("stack v mystack1:");
                for (int k = 0; k < 5; k++) {

                    System.out.println(mystack1.pop());
                    System.out.println("stack v mystack2:");
                    for (int p = 0; p < 8; p++) {

                        System.out.println(mystack2.pop());
                    }
                }
            }
        }
    }}