package com.string.Main;

import java.util.Scanner;
import com.string.CS.ConvString;

public class Main {

    public static void main(String[] args) {
        ConvString Main;
        String maxString = new String(); 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string of tokens: ");
        String str_0 = scanner.nextLine();
        System.out.print("Enter string of separators: ");
        String str_1 = scanner.nextLine();
        System.out.print("Enter amount which you want to find: ");
        String P = scanner.nextLine();
        Main = new ConvString(str_0, str_1, P);
        Main.FindAllInDualSystem();

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("All tokens: ");
        for(String word : Main.getWords()){
            System.out.print(String.format("%s ", word));
        }

        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("All tokens that are numbers: ");
        Main.FindAllTokensWithNumbers();

        for(String word : Main.getArraylist_1()){
            System.out.print(word + " ");
        }

        Main.FindPalindrome();

        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("All numbers that are not palindrome: ");
        for(String pal : Main.getPalindromesList()){
            System.out.print(pal + " ");
        }

        Main.Final();

        System.out.println(String.format("The largest number: %s", Main.getArraylist_1().get(Main.getArraylist_1().size() - 1)));
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(String.format("First after deleting token consists numbers and characters: \n%s", Main.getBuffer().toString()));

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(String.format("First line after adding the largest number: \n%s", Main.getBuffer().toString()));

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Sorting list by amount of numbers: ");

        Main.SortListByAmount();

        for(String list : Main.getSortListByAmount()){
            System.out.print(String.format("%s ", list));
        }
    }

}