package Praktik;

import java.util.Scanner;

public class BankCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input transaction sum in $");
        System.out.print("Transaction money=");
        int money = scanner.nextInt();
        int com;
            if (money < 8){
                System.out.println("The amount is not enough for the transfer" + "Տhe minimum amount- 8$");
                }
           else if(money > 8 && money <= 100){
                System.out.println("Maximum transfer amount = " + (money - 7) + "$");
                System.out.println("Commission =" + 7 + "$");}
           else if (money >0 ) {
                System.out.println("Maximum transfer amount = " + (money - 7- ((money/100) * 7)) + "$");
                com=(money/100) * 7;
                int o=7+com;
                System.out.println("Commission =" + o +"$");
            }

    }
}