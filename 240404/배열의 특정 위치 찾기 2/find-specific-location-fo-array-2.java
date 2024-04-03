import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int odd = 0, even = 0;

        for (int i=0; i<10; i++){
            
            arr[i] = sc.nextInt();
            if (i%2 == 0){
                odd += arr[i];
            } else{
                even += arr[i];
            }
        }

        if (odd>= even){
            System.out.print(odd-even);
        }else{
            System.out.print(even-odd);
        }

    }
}