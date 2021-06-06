package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 17
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        double r = 1;

        int gender = genderInput();
        int ounceAlc = alcoholInput();
        int weight = weightInput();
        int hours = hoursInput();

        if (gender == 1 ){

            r = 0.73;
        }
        else{

            r = 0.66;
        }

        double BAC = ( ounceAlc *  5.14 / weight * r )  - 0.015 * hours;

        DecimalFormat format = new DecimalFormat("0.000000");

        System.out.print("Your BAC is ");
        System.out.print(format.format(BAC));
        System.out.println(".");



        String outputMessage = ( BAC < 0.08) ? "It is legal for you to drive." : "It is not legal for you to drive.";
        System.out.println(outputMessage);

    }

    private static int genderInput() {

        aa:

        for(;;) {

            System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
            String genderInput = in.nextLine();
            int gender = Integer.parseInt(genderInput);

            if (gender == 1 || gender == 2){

                return gender;

            }

        }

    }


        private static int alcoholInput () {

            System.out.print("How many ounces of alcohol did you consume? ");
            int alcoholInput = in.nextInt();


            return alcoholInput;

        }

        private static int weightInput () {

            System.out.print("What is your weight, in pounds? ");
            int weightInput = in.nextInt();

            return weightInput;

        }

        private static int hoursInput () {

            System.out.print("How many hours has it been since your last drink? ");
            int weightInput = in.nextInt();

            return weightInput;

        }

    }
