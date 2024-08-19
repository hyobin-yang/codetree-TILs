import java.util.Scanner;

public class Main{

    public static int max;
    public static int n;
    public static int[][] arr;

    
    public static int calculate(int row1, int col1, int row2, int col2){
        int sum = 0;

        for (int i=row1; i<=row2; i++){
            for (int j=col1; j<=col2; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n][n];
        max = 0;
    
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (int i=0; i<=n-3; i++){
            for (int j=0; j<=n-3; j++){
                int tmp = calculate(i, j, i+2, j+2);
                if (tmp > max){
                    max = tmp;
                }
            }
        }

        System.out.print(max);
    }

}