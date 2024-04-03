import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        while(true){
            int score = sc.nextInt();
            
            if (score>=10){
                int range = (int)score/10;
                arr[range-1] ++;
            } else if(score == 0){
                break;
            }

        }

        for (int i=9; i>=0; i--){
            System.out.printf("%d - %d", (i+1)*10, arr[i]);
            System.out.println();
        }


    }
}