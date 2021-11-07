package Homework.Block;

import java.util.Scanner;

public class BlockTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "hello (ja{va)}";
        char[] chars = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
        char c = text.charAt(0);
    }
}