import java.util.Arrays;
import java.util.Random;
import java.io.PrintStream;

public class exercises {

    
public static void main(String[] args) {

    //PRINTS RANDOMIZED NUMBER LIST*****************
        
        int scores = 3; // # of values; can change
        int[] counts = new int[3];// # of counts; can change
        int[] array = randomArray(scores); //create

System.out.printf("Our array has  %s values.", scores); 
System.out.println("\nThis is our array:");
printArray(array); //print

    for (int score : array) {
        counts[score]++;
printArray(counts);
            }
}
//public static int historgram(int[] array){
    



/*/TRAVERSE + COUNT ARRAY*************************
public static int inRange(int[] a, int low, int high) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] >= low && a[i] < high) {
            count++;
        }
    }
    return count;
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




