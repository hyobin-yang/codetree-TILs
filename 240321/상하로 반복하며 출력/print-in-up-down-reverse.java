import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            int cnt = i;
            for (int j=1; j<=n; j++){
                System.out.print(cnt);
                cnt = n+1-cnt;
            }
            System.out.println();
        }
    }
}