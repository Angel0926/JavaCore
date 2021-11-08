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
    public void check() {
        Stack stack = new Stack();
        int index = -1;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            index++;
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == '}' || c == ')' || c == ']') {
                char cpop = stack.pop();
                switch (c) {
                    case '}':
                        if (cpop == '[')
                            System.out.println("Error: opened [ and closed } at index" + index);
                        if (cpop == '(')
                            System.out.println("Error: opened ( and closed } at index " + index);
                        break;
                    case ']':
                        if (cpop == '{')
                            System.out.println("Error: opened { and closed ] at index " + index);
                        if (cpop == '(')
                            System.out.println("Error: opened ( and closed ] at index " + index);
                        break;
                    case ')':
                        if (cpop == '{')
                            System.out.println("Error: opened { and closed ) at index " + index);
                        if (cpop == '[')
                            System.out.println("Error: opened [ and closed ) at index " + index);
                        break;
                }
            }
        }
    }
}

