package com.biziol;

import java.util.Scanner;

public class Inputer {
    private Scanner scanner = new Scanner(System.in);

    public String readLine() {
        return scanner.nextLine();
    }

    public String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public String readPassword() {
        if (System.console() != null) {
            return new String(System.console().readPassword());
        } else {
            System.err.println("Warning: This function is only available in a real console. If you are using an IDE like IntelliJ, it will not work because it uses a dummy terminal instead of a real one.");
            return null;
        }
    }

    public String readPassword(String prompt) {
        if (System.console() != null) {
            return new String(System.console().readPassword(prompt));
        } else {
            System.err.println("Warning: This function is only available in a real console. If you are using an IDE like IntelliJ, it will not work because it uses a dummy terminal instead of a real one.");
            return null;
        }
    }

    public Integer readInteger() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                scanner = new Scanner(System.in);
                System.err.println("\u001B[31;1m|Not valid input, insert an integer|\u001B[0m");
            }
        }
    }

    public Integer readInteger(String prompt) {
        
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (Exception e) {
                scanner = new Scanner(System.in);
                System.err.println("\u001B[31;1m|Not valid input, insert an integer|\u001B[0m");
            }
        }
    }

    public Double readDouble() {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                scanner = new Scanner(System.in);
                System.err.println("\u001B[31;1m|Not valid input, insert a number|\u001B[0m");
            }
        }
    }

    public Double readDouble(String prompt) {
        
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextDouble();
            } catch (Exception e) {
                scanner = new Scanner(System.in);
                System.err.println("\u001B[31;1m|Not valid input, insert a number|\u001B[0m");
            }
        }
    }

    public Scanner getScanner(){
        return scanner;
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}