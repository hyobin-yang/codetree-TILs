import java.util.Scanner;


public class Main {
    
    public static int[][] arr;
    public static int row;
    public static int col;
    public static int max = 0;

    public static void block1(int x, int y){
        if(x+1 >= row || y+1 >= col){
            return;
        }

        int sum = arr[x][y] + arr[x+1][y] + arr[x][y+1] + arr[x+1][y+1];
        max = Math.max(max, sum - arr[x][y]);
        max = Math.max(max, sum - arr[x+1][y]);
        max = Math.max(max, sum - arr[x][y+1]);
        max = Math.max(max, sum - arr[x+1][y+1]);
    }

    public static void block2(int x, int y){
        if(x+2 >= row || y >= col){
            return;
        }
        int sum = arr[x][y] + arr[x+1][y] + arr[x+2][y];
        max = Math.max(max, sum);
    }

    public static void block3(int x, int y){
        if(x >= row || y+2 >= col){
            return;
        }
        int sum = arr[x][y] + arr[x][y+1] + arr[x][y+2];
        max = Math.max(max, sum);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 행렬 크기 받기
        row = sc.nextInt();
        col = sc.nextInt();

        //행렬 채우기
        arr = new int[row][col];
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                // 3가지 경우 돌리기
                block1(i, j);
                block2(i, j);
                block3(i, j);
            }
        }

        System.out.print(max);
        
    }
}