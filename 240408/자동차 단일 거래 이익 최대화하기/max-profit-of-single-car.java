import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int profit = 0;
        int tmp;

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                tmp = arr[j] - arr[i];
                if (profit < tmp){
                    profit = tmp;
                }
            }
        }
        System.out.print(profit);

    }
}