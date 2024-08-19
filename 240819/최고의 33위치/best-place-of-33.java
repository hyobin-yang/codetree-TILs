import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;

        for (int a=0; a<=n-3; a++){
            int sum = 0;
            for (int i=a; i<=a+2; i++){
                for (int b=0; b<=n-3; b++){
                    for (int j=b; j<=b+2; j++){
                        sum += arr[i][j];
                    }
                }
            }
            if (sum > max){
                    max = sum;
            }
        }

        System.out.print(max);
    }
}