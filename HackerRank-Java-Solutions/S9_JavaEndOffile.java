import java.io.*;
import java.util.*;

<<<<<<< HEAD
public class S9_JavaEndOffile {
=======
public class Solution9 {
>>>>>>> 8e0566bce6d38aeb69d4816281a868cb706bf69c

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int i = 1;
        while(input.hasNext()){ //until EOF
            String a = input.nextLine();
            System.out.println(i + " " + a);
            i++;
        }
    }
}
