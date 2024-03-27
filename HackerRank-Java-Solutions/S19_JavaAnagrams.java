import java.util.Scanner;

public class S19_JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() > b.length() || a.length() < b.length()) {
            return false;
        }
        String[] arrA = a.split("");
        String[] arrB = b.split("");

        for (String s : arrA) {
            for (int j = 0; j < arrB.length; j++) {
                if (s.equalsIgnoreCase(arrB[j])) {
                    arrB[j] = "";
                    break;
                }
            }
        }

        String g = new String();
        for (String s : arrB) {
            g += s;
        }
        if(g.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
