package Homework.newHomework.NewBraceChecker;
public class NewBraceChecker {
    //կլասի կոնստրուկտերն է, որը պետք է ընդունի String տիպի տեքստ և վերագրիվերևի տեքստին
    //որ չկարողանանք breacjchecker-ի օբյեկտ սարքենք առանց text-
    // տալու կոնստրուկտորի միջոցով
    private String text;
    public NewBraceChecker(String text) {
        this.text = text;}
    public void check() {
        Stack stack = new Stack();
        boolean isValid = true;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int pop;
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error: Closed " + c + " but nothing opened at " + i);
                    } else if (pop != ('(')) {
                        isValid = false;
                        System.err.println("Error: Closed" + c + "but opened" + (char) pop + i);
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error: Closed " + c + " but nothing opened at " + i);
                    } else if (pop != ('{')) {
                        isValid = false;
                        System.err.println("Error: Closed" + c + "but opened" + (char) pop + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error: Closed " + c + " but nothing opened at " + i);
                    } else if (pop != ('[')) {
                        isValid = false;
                        System.err.println("Error: Closed" + c + "but opened" + (char) pop + i);
                    }
                    break;
            }
        }
        int last;
        while ((last = stack.pop()) != 0) {
            isValid = false;
            System.err.println("Error: opened " + (char) last + "but nothing closed");}
        if (isValid)
            System.out.println("Everything is good");
    }
}
