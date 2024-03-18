import java.io.*;
import java.util.*;

public class S9_JavaEndOffile {

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
