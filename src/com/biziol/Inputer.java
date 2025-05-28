package com.biziol;

import java.util.Scanner;

public class Inputer {
    private Scanner in = new Scanner(System.in);

    public String readLine(String prompt) {
            System.out.print(prompt + " --> ");
            return in.nextLine();
    }

    public Integer readInteger(String prompt) {
        while (true) {
            try {
                System.out.print(prompt + " --> ");
                return Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                System.err.println("\u001B[31;1m|Not valid input, insert an integer|\u001B[0m");
            }
        }
    }

    public Double readDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt + " --> ");
                return Double.valueOf(in.nextLine());
            } catch (Exception e) {
                System.err.println("\u001B[31;1m|Not valid input, insert a number|\u001B[0m");
            }
        }
    }

    public void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}