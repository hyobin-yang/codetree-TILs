import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        int tmp;

        for (int i=0; i<n; i++){
            tmp = i+1;
            for (int j=0; j<n; j++){
                arr[i][j] = tmp + n*j;
            }
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}