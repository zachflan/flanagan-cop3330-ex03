/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = in.nextLine();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Who said it? ");
        String whoSaid = in2.nextLine();

        String outputString = whoSaid + " says, \"" + quote + "\"";
        System.out.println(outputString);
    }
}