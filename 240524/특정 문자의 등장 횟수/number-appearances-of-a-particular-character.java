import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String a = "ee";
        String b = "eb";

        int aCount = 0;
        int bCount = 0;

        int sLength = s.length();

        for (int i=0; i < sLength-1; i++){
            if ( s.substring(i, i+2).equals(a)){
                aCount++ ; 
            }
            if ( s.substring(i, i+2).equals(b)){
                bCount++ ; 
            }
        }

        System.out.print(aCount + " " + bCount);

    }
}