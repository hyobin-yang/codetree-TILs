import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum =0, cnt =0;

        for (int i=1; i<=n; i++){
            int num = sc.nextInt();

            sum += num;
            cnt += 1;
        }

        System.out.printf("%d %.1f", sum, (double)sum/cnt);
    }
}