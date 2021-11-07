package Lesson12.Stack3;

public class Stack3Dem0 {
    public static void main(String args[]) {
        Stack3 mystack1 = new Stack3();
        Stack3 mystack2 = new Stack3();
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);
        System.out.println("Стек в mystack1: ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());
        System.out.println("Стек в mystack2: ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());
    }
    }
