import java.io.*;
import java.util.*;

/*************************
A. Exercise 2  
Write a method named isDivisible that takes two integers, n and m, and that returns true if n is divisible by m, and false otherwise.
B. Exercise 3  
*Write a method named isTriangle that takes three integers as arguments and returns either true or false, depending on whether you can or cannot form a triangle from sticks with the given lengths. The point of this exercise is to use conditional statements to write a value method.
C.The goal of this exercise is to translate a recursive definition into a Java method. The Ackermann function is defined for non-negative integers as follows:
(see text)
*Write a method called ack that takes two ints as parameters and that computes and returns the value of the Ackermann function.
*Test your implementation of Ackermann by invoking it from main and displaying the return value. Note the return value gets very big very quickly. You should try it only for small values of m and n (not bigger than 3).
********************************/
public class Methods{
  

public static void main(String[] args)
    {
    int n = 4;
    int m = 2;
    System.out.println(isDivisible(n, m));
    
    int A = 12;
    int B = 6;
    int C = 6;
    System.out.println(isTriangle(A, B, C));
        
    int x=1;
    int y=0;
    System.out.println (ack(x,y));
            

        }
//A. 
public static boolean isDivisible(int n, int m)
    {if (n % m == 0) {
        return true;
    } else  {
        return false; 
    }
}
    
//B. 
public static boolean isTriangle(int A, int B, int C){
    if ( B+C<A || A+C<B || A+B<C) {
        return false;
    } else {
        return true; 
    }
}

//C.
public static int ack(int x, int y) {
int result = y+1;
    
    if (x == 0) {
       return result;
        
    } else  {
        if (x > 0 && y == 0) {
           int calcA = x-1;
           int func = ack(calcA, 1);
            return func;
        } else {
            return y+50;
        }
    }
    }
}
      /** 
           
        } else  {
            if (x > 0 && y > 0) {
            int calcA = x-1;
            int calcB = y-1;
            int calcC = ack(m, calcB);
            int result = ack (calcA, calcC);
            return result;
                
            } else {
                return "invalid integer";
    */

    

