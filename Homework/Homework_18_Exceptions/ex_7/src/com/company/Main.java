package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            method();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
    public static void method() throws Exception{
        throw new Exception();
    }
}
