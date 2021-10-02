package das3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b havasar e " + b);
        b = true;
        System.out.println("b havasar e " + b);
        //xekavarum e if operatorin
        if (b)
            System.out.println("kod@ ashxatum e");
        b = false;
        if (b)
            System.out.println("kod@ chi ashxatum");
        System.out.println("10 > 9 " + (10 > 9));
    }
}
