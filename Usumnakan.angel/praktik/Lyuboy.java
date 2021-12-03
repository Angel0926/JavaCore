package praktik;

public class Lyuboy {
    public static void main(String[] args) {
        String text = "hello (world) JAVA";
        char[] text1 = text.toCharArray();
        char c;
        for (int i = 0; i < text.length(); i++) {
            c = text.charAt(i);
           bloj: if(text1[i] == '(' || text1[i] != ')'  ) {
                continue;}

        }
        for (int i = text.length() - 1; i >= 0; i--) {
            c = text.charAt(i);
            if(text1[i] == ')') {
            System.out.print(c);
        }
            }
        }}
