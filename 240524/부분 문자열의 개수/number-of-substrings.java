import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int aLength = a.length();
        int count = 0;

        for (int i=0; i<aLength-1; i++){
            if (a.substring(i, i+2).equals(b)){
                count ++;
            }
        }

        System.out.print(count);
    }
}