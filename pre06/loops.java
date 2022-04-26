import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;

/*************************
A. CH7.9_Exercise1 (see pdf) 

B. CH7.9_Exercise2 
C. CH7.9_Exercise3
D. CH7.9_Exercise4 
********************************/
public class loops {


public  static void main (String[]args) {

        double a; //target num (why over 2?)
        double guess1; //first guess
    
    Scanner in = new Scanner(System.in);

    //prompt user to choose target number 
    System.out.println("What whole number would you like to find the square root of?");
    a = in.nextInt(); 
    
    //print target num & input 1st guess
    System.out.printf("\nOk! Let's find the square root of %2f! \nWhat do you think its square root might be?", a);
    guess1 = in.nextInt(); 

    System.out.println(squareROOT(a, guess1));
    }

    
//B.    
public  static double squareROOT (double a, double guess1) {

Scanner in = new Scanner(System.in);

            double diff;            
            double sqrt;
            sqrt = (guess1+(a/guess1))/2.0; 
            diff = (Math.abs(a - sqrt));
    
    //process & print first guess 
        //System.out.printf("\nFirst approximation is: %4f.", sqrt);
    
    //process & print 
        double i = a;
        double a2 = sqrt;
       
    while (diff >= 0.0001) {
        i = sqrt = (guess1+(i/guess1))/2.0;
        System.out.println(a2);
        //i = a2;
        }
    return Math.abs(a - a2);

    }   
}
