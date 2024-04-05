import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<q; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 1){
                System.out.println(arr[b-1]);
            } else if (a == 2){
                for (int j=0; j<n; j++){
                    if (arr[j] == b){
                        System.out.println(j+1);
                        break;
                    }
                    if (j==n-1){
                        System.out.println(0);
                    }
                }
            } else if (a==3){
                int c = sc.nextInt();
                for (int j=b-1; j<=c-1; j++){
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}