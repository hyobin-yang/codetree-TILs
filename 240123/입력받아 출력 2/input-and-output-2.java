import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");

        String front = sc.next();
        String back = sc.next();

        System.out.print(front+back);

    }
}