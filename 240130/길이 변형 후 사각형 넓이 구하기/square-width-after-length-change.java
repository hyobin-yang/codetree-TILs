import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horizontal = sc.nextInt();
        int vertical = sc.nextInt();

        horizontal += 8;
        vertical *= 3;

        System.out.printf("%d\n%d\n%d", horizontal, vertical, horizontal*vertical);

    }
}