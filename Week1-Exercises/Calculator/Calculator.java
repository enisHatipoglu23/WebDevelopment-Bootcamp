package com.company;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    void calc(){
        System.out.println("-*- CALCULATOR -*-");

        System.out.println("""
                1- Sum
                2- Minus
                3- Multiply
                4- Divide
                5- Mod
                6- Pow
                7- Sqrt
                8- Exit""");

        System.out.println("Select one:");

        //For the selecting and operation part i'm using scanner function.
        int select = scanner.nextInt();
        if (select >= 1 && select <= 8){
            //Using switch case rather than if, because switch case is more functional than if in such cases.
            switch (select){
                case 1:
                    System.out.println("Numbers:");
                    //Using double datatype for integer, float or big numbers.
                    sum(scanner.nextDouble(), scanner.nextDouble());
                    //The reason i called calc() function in switch case is that switch case has a "break" code
                    //at the end of the case's that's cause function to finish. That's why i added calc() to
                    //start again the function.
                    calc();
                    break;
                case 2:
                    System.out.println("Numbers:");
                    minus(scanner.nextDouble(), scanner.nextDouble());
                    calc();
                    break;
                case 3:
                    System.out.println("Numbers:");
                    multiply(scanner.nextDouble(), scanner.nextDouble());
                    calc();
                    break;
                case 4:
                    System.out.println("Numbers:");
                    divide(scanner.nextDouble(), scanner.nextDouble());
                    calc();
                    break;
                case 5:
                    System.out.println("Numbers:");
                    mod(scanner.nextDouble(), scanner.nextDouble());
                    calc();
                    break;
                case 6:
                    System.out.println("Numbers:");
                    pow(scanner.nextDouble(), scanner.nextDouble());
                    calc();
                    break;
                case 7:
                    System.out.println("Numbers:");
                    sqrt(scanner.nextInt());
                    calc();
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    break;
                default:

                    System.out.println(scanner.nextDouble() + ", " + scanner.nextDouble());
            }
        }else{
            System.out.println("Wrong number!");
            calc();
        }

    }

    void sum(double num1, double num2){

        System.out.println("num1: " + num1 + "\nnum2: " + num2);
        System.out.println("Result: " + (num1 + num2));
    }

    void minus(double num1, double num2){
        System.out.println("num1: " + num1 + "\nnum2: " + num2);        System.out.println("Result: " + (num1 - num2));
    }

    void divide(double num1, double num2){
        System.out.println("num1: " + num1 + "\nnum2: " + num2);        System.out.println("Result: " + (num1 / num2));
    }

    void mod(double num1, double num2){
        System.out.println("num1: " + num1 + "\nnum2: " + num2);        System.out.println("Result: " + (num1 % num2));
    }

    void multiply(double num1, double num2){
        System.out.println("num1: " + num1 + "\nnum2: " + num2);        System.out.println("Result: " + (num1 * num2));
    }

    void pow(double num1, double num2){
        System.out.println("num1: " + num1 + "\nnum2: " + num2);        double pow = Math.pow(num1, num2);
        System.out.println("Result: " + pow);
    }

    void sqrt(double num1){
        System.out.println("the num: " + num1);
        double sqrt = Math.sqrt(num1);
        System.out.println("Result: " + sqrt);
    }


}
