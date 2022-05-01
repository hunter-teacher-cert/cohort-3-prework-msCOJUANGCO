import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Random;


/*************************
A. powArray & historgram

********************************/
public class array {

public static void main(String[] args) {
        double [] a = {2,3,4};
        double power;
        power = 3.0;
    
    powArray (a,power);
    }
    
public static void powArray(double [] a,double power) {

    for (int i = 0; i < a.length; i++) {
        double result;
        result = a[i]*power;
        System.out.println(result);
        }
    }



public static int histogram(int[] b, int low, int high) {
                            int count = 0;
    
    for (int i = 0; i < b.length; i++) {
        if (b[i] >= low && a[i] < high) {
            count++;

            
    int[] scores = randomArray(100);
    int a = inRange(scores, 90, 100);
    int b = inRange(scores, 80, 90);
    int c = inRange(scores, 70, 80);
    int d = inRange(scores, 60, 70);
    int f = inRange(scores, 0, 60);
    int[] counts = new int[100];
            
    for (int i = 0; i < counts.length; i++) {
    counts[i] = inRange(scores, i, i + 1);



    return count;


    *******

for (int i = 0; i < values.length; i++) {
    int value = values[i];
    System.out.println(value);
}
We could rewrite the loop like this:

for (int value : values) {
    System.out.println(value);
}


}
