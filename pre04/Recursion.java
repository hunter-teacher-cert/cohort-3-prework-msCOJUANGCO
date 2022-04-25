
public class Recursion {

    public static void main(String[] args) {

    

        System.out.println("nLines");
        nLines(4);

    
    }


    public static void nLines(int n) {
        if (n > 0) {
            System.out.println();
            nLines(n - 1);
        }
    }

    
}