package ClassWork.allLessons.lesson6and7and8;

public class Findprime {
     public static void main(String args[]) {
           int num;
           boolean isprime;
           num = 14;
           if (num < 2) isprime = false;
           else isprime = true;
           for (int i = 2; i <= num / i; i++){
               if ((num % i) == 0) {
                   isprime = false;
                   break;
               }}
                   if (isprime) System.out.println("Пpocтoe число");
                   else System.out.println("He простое число");
       }}