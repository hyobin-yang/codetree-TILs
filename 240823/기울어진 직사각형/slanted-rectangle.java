import java.util.Scanner;


public class Main {

    public static int n;
    public static int[][] grid;
    public static int maxSum = 0;

    public static int circulate(int startX, int startY){
        int currentX = startX;
        int currentY = startY;
        int sum = grid[currentX][currentY];

        int[] dx = new int[]{-1, -1, 1, 1};
        int[] dy = new int[]{1, -1, -1, 1};
        int[] arr = new int[]{0, 0, 0, 0};

        for (int i=0; i<4; i++){
            while(true){

                if (currentX+dx[i] == startX && currentY+dy[i] == startY && arr[0]==arr[2]){
                    return sum;
                }

                if ( rangeCheck(currentX+dx[i], currentY+dy[i]) ){
                    currentX += dx[i];
                    currentY += dy[i];
                    sum += grid[currentX][currentY];
                    arr[i] += 1;
                } else{
                    break;
                }
            }
        }

        return maxSum;
        

    }

    public static boolean rangeCheck(int x, int y){
        return (x>=0 && x<n && y>=0 && y<n);
    }



    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        for (int i=1; i<n; i++){
            for (int j=1; j<n-1; j++){
                maxSum = Math.max(circulate(i, j), maxSum);
            }
        }

        System.out.print(maxSum);


    }
}