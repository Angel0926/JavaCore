package Homework.BraceChecker;

public class BraceChecker {
    //սա հենց տեքստն է
    private String text;

    //կլասի կոնստրուկտերն է, որը պետք է ընդունի String տիպի տեքստ և վերագրիվերևի տեքստին
    //որ չկարողանանք breacjchecker-ի օբյեկտ սարքենք առանց text-
    // տալու կոնստրուկտորի միջոցով
    public BraceChecker(String i) {
        text = i;
    }

    //Սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան, աշխատելու ենք թե stack-ի
// հետ , թե վերևի text-ի
    public String check() {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            String name = text;
            char c = name.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);}
            else if (c == ']') {
                if (stack.pop() == '[')
                    System.out.println("open [ and close ]");
                else if (stack.pop() == '{')
                    System.out.println("{ but close ]");
                else if (stack.pop() == '(')
                    System.out.println("open ( but close ]");
            } else if (c == '}') {
                if (stack.pop() == '{')
                    System.out.println(" { and close }");
                else if (stack.pop() == '[')
                    System.out.println("open [ but close }");
                else if (stack.pop() == '(')
                    System.out.println("open ( but close }");
            } else if (c == ')') {
                if (stack.pop() == '(')
                    System.out.println("open ( and  close )");
                else if (stack.pop() == '{')
                    System.out.println("open { but close )");
                else if (stack.pop() == '[')
                    System.out.println("open [ but close )");
            }
        }
        return null;
    }


}
