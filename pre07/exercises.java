import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;

public class exercises {

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
}
