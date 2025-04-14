package com.biziol;
import java.io.Console;
import java.io.Reader;

public class Inputer{
    private Console console = System.console();

    public String readLine(){
        return console.readLine();
    }

    public String readLine(String prompt){
        return console.readLine(prompt);
    }

    public char[] readPasswd(){
        return console.readPassword();
    }

    public char[] readPasswd(String prompt){
        return console.readPassword(prompt);
    }

    public Integer readInteger(){
        while (true) {
            try {
                return Integer.parseInt(console.readLine());
            } catch (Exception e) {
                System.err.println("\u001B[31;1m|Not valid input, insert an integer|\u001B[0m");
            } 
        }
    }

    public Integer readInteger(String prompt){
        while (true) {
            try {
                return Integer.parseInt(console.readLine(prompt));
            } catch (Exception e) {
                System.err.println("\u001B[31;1m|Not valid input, insert an integer|\u001B[0m");
            }
        }
    }

    public Double readDouble(){
        while (true) {
            try {
                return Double.parseDouble(console.readLine());
            } catch (Exception e) {
                System.err.println("\u001B[31;1m|Not valid input, insert a number|\u001B[0m");
            }
        }
    }

    public Double readDouble(String prompt){
        while (true) {
            try {
                return Double.parseDouble(console.readLine(prompt));
            } catch (Exception e) {
                System.err.println("\u001B[31;1m|Not valid input, insert a number|\u001B[0m");
            }
        }
    }

    public Reader reader(){
        return console.reader();
    }
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
