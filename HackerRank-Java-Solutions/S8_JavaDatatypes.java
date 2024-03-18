import java.util.*;
import java.io.*;



class S8_JavaDatatypes {
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Math.pow(-2, 8) && x<=Math.pow(2, 8))System.out.println("* byte");
                //Complete the code
                if(x >= Math.pow(-2, 15) && x <= Math.pow(2, 15)) System.out.println("* short");
                if(x >= Math.pow(-2, 31) && x <= Math.pow(2, 31)) System.out.println("* int");
                if(x >= Math.pow(-2, 63) && x <= Math.pow(2, 63)) {
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



