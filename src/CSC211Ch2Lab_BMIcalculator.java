/*
 * Lab Lab2
 * Description: BMI Calculator
 * Name: Christian Shih
 * ID: 921026207
 * Class: CSC 21104
 * Semester: Fall 2020
 */

// import scanner//
import java.util.Scanner;
public class CSC211Ch2Lab_BMIcalculator
{
    public static void main(String[] args)
    {
        // state this is my BMI calculator//
        System.out.println("Welcome to Christian's BMI Calculator OwO");

        /*
        Set scanner and variable as weight
        */
        Scanner weight = new Scanner(System.in);
        System.out.println("Input your weight in kilogram:");
        int Weight = weight.nextInt();

        /*
        Set scanner and variable as height
         */
        Scanner height = new Scanner(System.in);
        System.out.println("Input your height in meters:");
        double Height = height.nextDouble();

        /*
        Print out the weight and height with measurement
         */
        System.out.println("Your Weight is: " + Weight + " Kg");
        System.out.println("Your Height is: "+ Height + " M");

        /*
        Print the result BMI  and change it to int number
         */
        System.out.println("Your BMI is: "+(Weight/(Height*Height)) + " kg/m2");
        System.out.println("---------------------------------------");
        double BMI = Weight/(Height*Height);
        int BMIint = (int)BMI;
        System.out.println("Your BMI casted into an int is: " + BMIint + " kg/m2");
    }
}
