import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        int plus = a + b, minus = a-b;
        int quotient = a / b, remainder = a%b;

        System.out.printf("%d\n%d\n%d\n%d", plus, minus, quotient, remainder);


    }
}