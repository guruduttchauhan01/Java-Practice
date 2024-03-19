import java.io.*;
import java.util.*;

public class S10_JavaStaticInitializerBlock {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        parallelogramArea();
    }

    static void parallelogramArea() {
        try {
            int b = input.nextInt();
            int h = input.nextInt();
            input.close();
            if(b <= 0 || h <= 0) {
                throw new Exception();
            }else {
                System.out.println(b * h);
            }
        } catch(Exception e) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}