import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for (int i=1; i<=n; i++){
            for (int j=0; j<i-1; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=n-i+1; j++){
                if (cnt == 10){
                    cnt = 1;
                }
                System.out.print(cnt + " ");
                cnt ++;
            }
            System.out.println();
        }
    }
}