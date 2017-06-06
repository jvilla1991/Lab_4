package com.grancircus.spring;

import java.util.Scanner;

public class Main {

    // Calculate the factorial of a number

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean b = true;

        do {
            int input = 0;
            int total = 1;

            System.out.println("Please enter an integer from 1 to 10");
            input = scnr.nextInt();

            // This validation method loops if user input doesn't match the request specifications
            input = intValidation(input);


            for (int i = 1; i <= input; i++) {
                total = total * i;
            }

            System.out.println(total);

            scnr.nextLine();

            System.out.println("Would you like to continue? (y/n)?");
            String prompt = scnr.nextLine();
            if ("n".equalsIgnoreCase(prompt))
            {
                b = false;
            }
            else
            {
                b = true;
            }

        } while (b == true);
    }

    
    public static int intValidation(int i)
    {
        Scanner scnr = new Scanner(System.in);
        while (i <= 0 || i >= 11)
        {
            System.out.println("Please enter an integer from 1 to 10");
            i = scnr.nextInt();
        }
        return i;
    }
}
