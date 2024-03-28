import java.io.*;
import java.util.*;

public class S20_JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        if(s.isEmpty()) {
            System.out.println("0");
        } else {
            String[] result =
                    s.split("[\\w]");
            System.out.println(result.length);
            for (int i=0; i<result.length; i++)
                System.out.println(result[i]);
        }
        scan.close();




    }
}

