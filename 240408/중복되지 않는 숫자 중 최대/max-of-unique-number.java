import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int maxVal = -1;
        int cnt = 0;

        for (int i=0; i<n; i++){
            cnt = 0;

            for (int j=0; j<n; j++){
                if (arr[j] == arr[i]){
                    cnt ++;
                }
            }

            if (cnt == 1 && arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        
        System.out.print(maxVal);



    }
}