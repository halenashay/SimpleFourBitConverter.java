//Author: Halena Wetton
//Date: January 27, 2020
//File: SimpleFourBitConverter.java

//Import scanner
import java.util.Scanner;

//Define class
public class SimpleFourBitConverter {

    public static void main(String[] args) {

        //Scanner instance
        Scanner scan = new Scanner(System.in);

        //Define variables
        int zero = (int)Math.pow(2,0);
        int one = (int)Math.pow(2,1);
        int two = (int)Math.pow(2,2);
        int three = (int)Math.pow(2,3);

        System.out.println("Please enter the first bit starting from the right: ");
        int bitZero = scan.nextInt();

        System.out.println("Please enter the second bit: ");
        int bitOne = scan.nextInt();

        System.out.println("Please enter the third bit: ");
        int bitTwo = scan.nextInt();

        System.out.println("Please enter the fourth bit: ");
        int bitThree = scan.nextInt();

        //Decimal value variable
        int decimalValue = (zero * bitZero) + (one * bitOne) + (two * bitTwo) + (three * bitThree);

        System.out.println("The binary number is: " + bitThree + "" + bitTwo + "" + bitOne + "" + bitZero);

        System.out.println("Converted decimal value is : " + decimalValue);
    }
}
