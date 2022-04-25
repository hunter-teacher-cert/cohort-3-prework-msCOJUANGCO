import java.io.*;
import java.util.*;

/*************************
A. Exercise 2  
Write a method named isDivisible that takes two integers, n and m, and that returns true if n is divisible by m, and false otherwise.
B. Exercise 3  
*Write a method named isTriangle that takes three integers as arguments and returns either true or false, depending on whether you can or cannot form a triangle from sticks with the given lengths. The point of this exercise is to use conditional statements to write a value method.
C.
*Write a method called ack that takes two ints as parameters and that computes and returns the value of the Ackermann function.
********************************/
public class loops{
    
public static void main(String[] args) {
    loop(333);
}

public static void loop(int n) {
    int i = n;
    while (i > 1) {
        System.out.println(i);
        if (i % 2 == 0) {
            i = i / 2;
        } else {
            i = i + 1;
        }
    }
    }

}