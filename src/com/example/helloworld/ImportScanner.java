package com.example.helloworld;
import java.util.Scanner;

public class ImportScanner {
    public static void main(String[] args) {
        Scanner dog = new Scanner(System.in);
        
        String first_name;
        System.out.print("Enter your first name:");
        first_name = dog.next();

        String family_name;
        System.out.print("Enter your family name:");
        family_name = dog.next();

        String full_name;
        full_name = first_name + "" + family_name;
        System.out.print("What is up " + full_name);

    }
}
