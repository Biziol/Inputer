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
        try {
            return Integer.parseInt(console.readLine());
        } catch (Exception e) {
            System.err.println("Not valid input, insert an integer");
        }
        return null;
    }

    public Integer readInteger(String prompt){
        try {
            return Integer.parseInt(console.readLine(prompt));
        } catch (Exception e) {
            System.err.println("Not valid input, insert an integer");
        }
        return null;
    }

    public Double readDouble(){
        try {
            return Double.parseDouble(console.readLine());
        } catch (Exception e) {
            System.err.println("Not valid input, insert a number");
        }
        return null;
        
    }

    public Double readDouble(String prompt){
        try {
            return Double.parseDouble(console.readLine(prompt));
        } catch (Exception e) {
            System.err.println("Not valid input, insert a number");
        }
        return null;
    }

    public Reader reader(){
        return console.reader();
    }
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
