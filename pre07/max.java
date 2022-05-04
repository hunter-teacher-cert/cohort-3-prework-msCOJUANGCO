import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;
import java.io.PrintStream;

/*************************
Write a method called indexOfMax that takes an array of integers and returns the index of the largest element. Can you write this method using an enhanced for loop? Why or why not?
********************************/
public class max{

public static void main(String[] args) {

        int values = 10; // # of values; can change
        int[] array = randomArray(values); //create
        int largest;
        
    
    //PRINTS RANDOMIZED NUMBER LIST**************
System.out.println();
System.out.printf("Our array has  %s values.", values); 
System.out.println("\nThis is our array:");
printArray(array); //print
System.out.println("\nThe largest element is:");

    indexOfMax (array, values);
    System.out.println (indexOfMax(array,values));
  
    
        }
 

public static int indexOfMax (int[] a, int length) {
    int largest = a[0];
    for (int i=0; i< length; i++) {
        if (a[i] > largest) {
            largest = a[i];}
                }
    return largest;
        }

        /*
    int count;
    for (int i = 0; i < a.length; i++) {
        if (a[i] >= 0 && a[i] < 100) {
            count++;
            }
        }
    return count;
    printArray(count);
    }    
*/

//CREATES RANDOM ARRAY*************************
public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
        a[i] = random.nextInt(100);
        }
      
    return a;
      }
  
//PRINTS ARRAYS*************************
public static void printArray(int[] a) {
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
    }
    System.out.println("}");
        }
    }  
