import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        for (int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        int cnt = 0;
        int result = 0;
        for (int i=0; i<=n1-n2; i++){
            if (arr1[i] == arr2[0]){
                cnt = i+1;
                
                for (int j=1; j<n2; j++){
                    if (arr1[cnt] != arr2[j]){
                        break;
                    }
                    result = 1;
                    break;
                }
            }
            if (result == 1){
                System.out.print("Yes");
                break;
            }
        }

        if (result == 0){
            System.out.print("No");
        }



    }
}