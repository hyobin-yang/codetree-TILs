import java.util.Scanner;

public class Main {

    public static int n;
    public static int m;
    public static int[][] arr;
    public static int result;

    public static boolean check(int cnt){
        return cnt == m;
    }

    public static int happySequence(int i){
        
        int prev;
        int current;

        int cnt = 1;
        for (int j=1; j<n; j++){
            prev = arr[i][j-1];
            current = arr[i][j];

            if (prev == current){
                cnt ++;
                if(check(cnt)){
                    result ++;
                    break;
                }
            } else{
                cnt = 1;
            }
        }
        //System.out.print("첫 번째" + result);

        cnt = 1;
        for (int j=1; j<n; j++){
            prev = arr[j-1][i];
            current = arr[j][i];

            if (prev == current){
                cnt ++;
                if(check(cnt)){
                    result ++;
                    break;
                }
            } else{
                cnt = 0;
            }
        }
        //System.out.print("두 번째" + result);

        return result;
    }


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        m = sc.nextInt();

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        result = 0;
        for (int i=0; i<n; i++){
            happySequence(i);
        }


        System.out.print(result);
    }
}