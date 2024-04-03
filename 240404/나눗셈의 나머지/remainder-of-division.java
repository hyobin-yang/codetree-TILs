import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        int[] arr = new int[b];

        while (a>1){
            arr[a%b] ++;
            a = (int)a/b;
        }

        int result = 0; 
        for (int i=0; i<b; i++){
            result += arr[i]*arr[i];
        }

        System.out.print(result);
    }
}