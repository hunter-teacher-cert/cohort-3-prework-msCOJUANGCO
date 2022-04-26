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
        double x; //first iteration/guess
    
Scanner in = new Scanner(System.in);

//prompt user to choose target number 
System.out.println("Choose a positive whole number.");
    a = in.nextInt(); 
System.out.printf("\nOk! Let's find the square root of %2f!\n", a);

x = a/2.0;
System.out.println(squareROOT(a, x));

    }
    

//B.    
public  static double squareROOT (double a, double x) {

            double i;  //difference        
            double sqrt;
//verify expression
    //System.out.printf("\nFirst approximation is: %4f.", sqrt);

    sqrt = (x+(a/x))/2.0;
    i = Math.abs(x - sqrt);

    while (i >= 0.0001) {
            sqrt = (x+(a/x))/2.0;
            System.out.println(sqrt);
            i = Math.abs(x - sqrt);
            x = sqrt;
        }
    return sqrt;
    }

}
    
    /**process & print (use do/while sample from text) 
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




   

    }   
}

*/