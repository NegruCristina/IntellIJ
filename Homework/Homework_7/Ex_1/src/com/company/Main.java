package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String a =scanner.nextLine();
	String b=scanner.nextLine();
        System.out.println(a.replace(a, b));
    }
}
