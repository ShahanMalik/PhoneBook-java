package com.company;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;
public class Moblie_Phone {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int user_input ;
                char operator;
                System.out.println("Welcome to Apple moblie");

                while (true){
                    System.out.println(" 1 - Time And Date \n"+
                            " 2 - Guessing Game \n"+
                            " 3 - Temperature Converter \n" +
                            " 4 - My Bank Account \n"+
                            " 5 - Calculator \n"+
                            " 6 - Phone Book \n" +
                            " 7 - Weight measure \n"+
                            " 8 - Currency Converter \n"+
                            " 9 - About phone \n" +
                            " 10 - Turn Off Phone  \n" );
                    user_input = scan.nextInt();
                    switch (user_input) {
                        case 1:{
                            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                            LocalDateTime now = LocalDateTime.now();
                            System.out.println(dtf.format(now) + "\n");
                        }
                        break;


                        case 2:{
                            int number = 1 + (int) (10 * Math.random());
                            System.out.println("In how many try you want to guess Lucky Number");
                            int K = scan.nextInt();
                            int i, guess;
                            System.out.println("Number Are from 1 to 10 , Guess in " + K + " Tries .");
                            for (i = 0; i < K; i++) {
                                System.out.println("Guess the Number:");
                                guess = scan.nextInt();
                                if (number == guess) {
                                    System.out.println("Congratulations! You guessed the Number.");
                                    break;
                                } else if (number > guess) {
                                    System.out.println("The Number is greater than " + guess);
                                } else if (number < guess) {
                                    System.out.println("The Number is less than " + guess);
                                }
                            }
                            if (i == K) {
                                System.out.println("You have exhausted Your tries.");
                                System.out.println("The Number was " + number + "\n ");
                            }
                        }
                        break;



                        case 3:{
                            System.out.println("Welcome to temperature App \n");
                            System.out.print("Enter a temperature: ");
                            double temp = scan.nextDouble();
                            System.out.print("Enter a unit of measurement (C, F, or K): ");
                            char unit = scan.next().toLowerCase().charAt(0);
                            double celsius, fahrenheit, kelvin;
                            if (unit == 'C') {
                                celsius = temp;
                                fahrenheit = (9.0 / 5.0) * celsius + 32;
                                kelvin = celsius + 273.15;
                            } else if (unit == 'F') {
                                fahrenheit = temp;
                                celsius = (5.0 / 9.0) * (fahrenheit - 32);
                                kelvin = celsius + 273.15;
                            } else {
                                kelvin = temp;
                                celsius = kelvin - 273.15;
                                fahrenheit = (9.0 / 5.0) * celsius + 32;
                            }
                            System.out.println("Celsius: " + celsius);
                            System.out.println("Fahrenheit: " + fahrenheit);
                            System.out.println("Kelvin: " + kelvin);
                        }
                        break;

                        case 4:{
                            System.out.println("**********EASYPAISA**********");
                            int balance=1000;
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("If you want to access your account please login first");
                            System.out.println("if you want to login enter 1");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            int Login=scan.nextInt();
                            if (Login!=1){
                                break;
                            }
                            else{
                                int guess=0;
                                System.out.println("Enter username");
                                String username1=scan.nextLine();
                                String username=scan.nextLine();
                                System.out.println("Enter password");
                                String password=scan.nextLine();
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                do{
                                    System.out.println("if you want to see your balance press 1");
                                    System.out.println("if you want to deposit your balance press 2");
                                    System.out.println("if you want to withdraw your balance press 3");
                                    System.out.println("if you want to exit press 4");
                                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    int press1=scan.nextInt();
                                    guess=press1;
                                    if (press1==1){
                                        System.out.println("your total is balance :"+balance);
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    }
                                    else if (press1==2){
                                        System.out.println("Enter money you want to deposit");
                                        int depositAmount = scan.nextInt();
                                        int t_depositAmount=balance+depositAmount;
                                        balance=t_depositAmount;
                                        System.out.println("total is money in your account is :"+t_depositAmount);
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    }
                                    else if (press1==3){
                                        System.out.println("Enter money you want to withdraw");
                                        int withdrawAmount = scan.nextInt();
                                        if (withdrawAmount<=balance){
                                            int t_withdrawAmount=balance-withdrawAmount;
                                            balance=withdrawAmount;
                                            System.out.println("total is money in your account is :"+t_withdrawAmount);
                                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        }
                                        else {
                                            System.out.println("the amount you entered is greater than the amount in you account");
                                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        }
                                    }
                                }while (guess!=4);


                            }

                        }
                        break;


                        case 5:{
                            int guess1=0;
                            do {
                                Double number1, number2, result;
                                System.out.println("Choose an operator: +, -, *, or /");
                                operator = scan.next().charAt(0);

                                System.out.println("Enter first Number");
                                number1 = scan.nextDouble();

                                System.out.println("Enter second Number");
                                number2 = scan.nextDouble();
                                switch (operator) {
                                    case '+':
                                        result = number1 + number2;
                                        System.out.println(number1 + " + " + number2 + " = " + result);
                                        break;

                                    case '-':
                                        result = number1 - number2;
                                        System.out.println(number1 + " - " + number2 + " = " + result);
                                        break;

                                    case '*':
                                        result = number1 * number2;
                                        System.out.println(number1 + " * " + number2 + " = " + result);
                                        break;

                                    case '/':
                                        result = number1 / number2;
                                        System.out.println(number1 + " / " + number2 + " = " + result);
                                        break;

                                    default:
                                        System.out.println("Invalid operator!");
                                        break;
                                }
                                System.out.println("if you want to exit press 1");
                                guess1=scan.nextInt();
                            }while (guess1!=1);

                        }
                         break;

                        case 6:{
                            long[] Number=new long[10];
                            String[] name=new String[10];
                            int choice=0;
                            do {
                                System.out.println("Please Pick A Task: \n 1:Add A Number \n 2:Dial A Number \n 3:Exit \n 4:View numbers");
                                choice = scan.nextInt();
                                switch (choice) {
                                    case 1:
                                        System.out.println("How many Number you want to add");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        int yourNumber = scan.nextInt();
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("");
                                        for (int i1 = 0; i1 < yourNumber; i1++) {
                                            System.out.print("Enter name : ");
                                            name[i1] = scan.nextLine();
                                            name[i1] = scan.nextLine();
                                            System.out.print("Enter Number : ");
                                            Number[i1] = scan.nextInt();
                                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        }
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        for (int i2 = 0; i2 < yourNumber ; i2++) {
                                            System.out.println("Number " + (i2+1));
                                            System.out.println((i2+1) + ") " + name[i2] + "    " +Number[i2] + "\n");
                                        }
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        break;
                                    case 2: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("1    2    3\n4    5    6\n7    8    9\n     0 ");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("Dial Number");
                                        long dial=scan.nextLong();
                                        System.out.println("Dialing ....");
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        break;
                                    }
                                    case 3: {
                                        System.out.println("");
                                        break;
                                    }
                                    case 4: {
                                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        System.out.println("Enter Number you want  to find ");
                                        String as= scan.nextLine();
                                        String toFind= scan.nextLine();
                                        boolean found = Arrays.asList(name).contains(toFind);
                                        int findIndex=Arrays.asList(name).indexOf(toFind);

                                        if(found)
                                            System.out.println("name :"+toFind + " phone :"+Number[findIndex]+"\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        else
                                            System.out.println(toFind + " is not found."+"\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                        break;
                                    }
                                    default: {
//                                        System.exit(0);
                                        break;
                                    }
                                }

                            }
                            while (choice != 3);
                        }
                        break;


                        case 7:{
                            int press2=0;
                            do {
                                System.out.print("Input weight in kilogram: ");
                                double weight = scan.nextDouble();
                                System.out.print(" Input height in meters: ");
                                double height = scan.nextDouble();
                                double BMI = weight / (height * height);
                                System.out.println(" The Body Mass Index (BMI) is " + BMI + " kg/m2");
                                System.out.println("if you want to exit press 1");
                                press2=scan.nextInt();
                            }while (press2!=1);
                        }
                        break;


                        case 8 :{
                            int press3=0;
                            do {
                                System.out.println("1 Ruppe");
                                System.out.println("2 Dollar");
                                System.out.println("3 Euro");
                                System. out.println("Choose the currency");
                                int choice1 = scan.nextInt();
                                System.out.println("Enter the amount");
                                double amount = scan.nextDouble();
                                switch (choice1) {
                                    case 1:
                                        Ruppe_to_other(amount);
                                        break;
                                    case 2:
                                        Dollar_to_other(amount);
                                        break;
                                    case 3:
                                        Euro_to_other(amount);
                                        break;
                                    default:
                                        System.out.println("Invalid choice1");
                                }
                                System.out.println("if you want to exit press 1");
                                press3=scan.nextInt();
                            }while (press3!=1);

                        }
                        break;

                        case 9 :{
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("Mobile RAM : 2");
                            System.out.println("Mobile ROM : 16");
                            System.out.println("Mobile BATTERY : 2500 mAh battery");
                            System.out.println("Body Color : Black");
                            System.out.println("Display Size : 3.4 inches,");
                            System.out.println("Display Colours : 240 x 320 pixels,");
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        }
                            break;

                        case 10:{
                            System.out.println("Turn Off Phone");
                            System.exit(0);
                        }
                        break;
                    }
                }
            }


            public static void Ruppe_to_other(double amt) {
                System.out.println("1 Ruppe = " + 0.013 + " Dollar");
                System.out.println();
                System.out.println(amt+" Ruppe = " + (amt*0.013) + " Dollar");
                System.out.println();
                System.out.println("1 Ruppe = " + 0.012 + " Euro");
                System.out.println();
                System.out.println(amt+" Ruppe = " + (amt*0.012) + " Euro");
                System.out.println();
            }
            public static void Dollar_to_other(double amt) {
                System.out.println("1 Dollar = " + 79.37 + " Ruppe");
                System.out.println();
                System.out.println(amt+" Dollar = " + (amt*79.37) + " Ruppe");
                System.out.println();
                System.out.println("1 Dollar= " + 0.98 + " Euro");
                System.out.println();
                System.out.println(amt+" Dollar = " + (amt*0.98) + " Euro");
            }
            public static void Euro_to_other(double amt){
                System.out.println("1 Euro = " + 80.85 + " Ruppe");
                System.out.println();
                System.out.println(amt+" Euro = " + (amt*80.85) + " Ruppe");
                System.out.println();
                System.out.println("1 Euro = " + 1.02 + " Dollar");
                System.out.println();
                System.out.println(amt+" Euro = " + (amt*1.02) + " Dollar");
            }
        }
