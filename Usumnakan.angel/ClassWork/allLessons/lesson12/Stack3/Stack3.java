package ClassWork.allLessons.lesson12.Stack3;

public class Stack3 {
    private  int stck[]=new int[10];
    private  int tos;
    Stack3(){
        tos=-1;
    }
    void push(int item){
        if(tos==9)
            System.out.println("is full");
        else stck[++tos]=item;
    }
    int pop(){
        if(tos<0){
            System.out.println("is not full");
            return 0;
        } else return stck[tos--];
    }
}

