import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if ((a>b && c>a) || (a>c && b>a)){
            System.out.print(a);
        } else if((b>a && c>b) || (b>c && a>b)){
            System.out.print(b);
        } else{
            System.out.print(c);
        }

    }
}