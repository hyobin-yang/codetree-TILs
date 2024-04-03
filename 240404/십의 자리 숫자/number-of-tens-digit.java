import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        while(true){
            int n = sc.nextInt();
            int c = (int)n/10;
            
            if (c!=0){
                arr[c-1] ++;
            }
            if (n==0){
                break;
            }
        }

        for (int i=0; i<9; i++){
            System.out.printf("%d - %d", i+1, arr[i]);
            System.out.println();
        }
    }
}