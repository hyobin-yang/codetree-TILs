import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = "ee";
        String b = "ab";

        String c = sc.next();

        if (c.contains(a)){
            System.out.print("Yes ");
        } else{
            System.out.print("No ");
        }

        if (c.contains(b)){
            System.out.print("Yes");
        } else{
            System.out.print("No");
        }
    }
}