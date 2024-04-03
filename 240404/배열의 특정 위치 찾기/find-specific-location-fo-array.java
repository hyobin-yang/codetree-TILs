import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        int result1 = 0, result2 = 0;

        for (int i=0; i<10; i++){
            
            arr[i] = sc.nextInt();

            if(i%2!=0){
                result1 += arr[i];
            }
            if((i+1)%3==0){
                result2 += arr[i];
            }
        }

        System.out.printf("%d %.1f", result1, (float)result2/3);


    }
}