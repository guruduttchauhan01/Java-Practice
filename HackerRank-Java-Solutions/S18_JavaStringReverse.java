import java.io.*;
import java.util.*;

public class S18_JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        String reverseA = "";
        for (int i = A.length() - 1; i >= 0;  i--) {
            reverseA += A.charAt(i);
        }

        //We can use compareTo also
        if(A.equals(reverseA)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}



