import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            int result = a;
            for (int j=a+1; j<=b; j++){
                result *= j;
            }
            System.out.println(result);
        }
    }
}