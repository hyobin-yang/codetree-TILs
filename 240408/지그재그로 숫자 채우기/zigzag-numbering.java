import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int num = 0;

        for (int i=0; i<m; i++){
            if (i%2 == 0){
                for (int j=0; j<n; j++){
                    arr[j][i] = num;
                    num ++;
                }
            } else{
                for (int j=n-1; j>=0; j--){
                    arr[j][i] = num;
                    num++;
                }
            }
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}



// 00 / 10 / 20 / 30
// 31 / 21 / 11 / 01
// 02 / 12 / 22 / 32



// 0 1 2 3 4 5 -> m
// 0 3 0 3 0 3 -> n