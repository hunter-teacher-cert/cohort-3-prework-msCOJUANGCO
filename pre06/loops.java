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
        double x; //first guess
    
Scanner in = new Scanner(System.in);

//prompt user to choose target number 
System.out.println("Choose a positive whole number.");
    a = in.nextInt(); 
System.out.printf("\nOk! Let's find the square root of %2f!\n", a);
 
System.out.println(squareROOT(a));

    }
}
    

//B.    
public  static double squareROOT (double a, double x) {

            double i;    //difference        
            double sqrt; //1st iteration
    
//verify expression
    //System.out.printf("\nFirst approximation is: %4f.", sqrt);
    
//process & print (use do/while sample from text) 
boolean okay;
    do {
        System.out.print("Enter a number: ");
    if (in.hasNextDouble()) {
        okay = true;
    } else {
        okay = false;
        String word = in.next();
        System.err.println(word + " is not a number");
    }
} while (!okay);
double x = in.nextDouble();




    x = a/2.0;
    while (i >= 0.0001) {
        System.out.println(sqrt);
        sqrt = (guess1+(a/guess1))/2.0; 
        System.out.println(guess1);
        i = (Math.abs(guess1 - sqrt));

        //i = a2;
        }
    return i;

    }   
}
*/