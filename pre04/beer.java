import java.io.*;
import java.util.*;
import java.util.Scanner;


/************************************
The purpose of this exercise is to take a problem and break it into smaller problems, and to solve the smaller problems by writing simple methods. Consider the first verse of the song “99 Bottles of Beer”:

Subsequent verses are identical except that the number of bottles gets smaller by one in each verse, until the last verse:

No bottles of beer on the wall,
no bottles of beer,
ya’ can’t take one down, ya’ can’t pass it around,
’cause there are no more bottles of beer on the wall!
And then the song (finally) ends.

Write a program that displays the entire lyrics of “99 Bottles of Beer”. Your program should include a recursive method that does the hard part, but you might want to write additional methods to separate other parts of the program. As you develop your code, test it with a small number of verses, like 3.
**********************************/
public class beer{

public static void main (String[]args){

bottlesLeft (2);
    
}

public static void bottlesLeft(int n) {
        if (n > 0) {
            System.out.print(n + " bottles of beer on the wall\r" + n + "bottles of beer, \nya' take one down, ya'pass it around, _bottles of beer on the wall");
            bottlesLeft(n - 1);
        
        } else {
            System.out.println("No bottles of beer on the wall, \nno bottles of beer, \nya'can't take one down \nya' can't pass it around, \n'cause there bottles of beer on the wall!");
         }
  
}            
            

}
    







	

