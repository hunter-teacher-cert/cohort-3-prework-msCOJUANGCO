import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class drafting {

public  static void main (String[]args) {

Scanner in = new Scanner(System.in);
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