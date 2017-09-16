package com.hc1.dolmatov;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;

        System.out.print("Введите скобочную последовательность: ");
        String str = s.nextLine();
        
        for(int i = 0; i < str.length(); i++) {
            char result = str.charAt(i);
            if (result == '(')
                count++;
            else count--;
        }

        if(count == 0)
            System.out.print("Правильная последовательность.");
        else
            System.out.print("Неправильная последовательность.");
    }
}
