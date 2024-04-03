import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = n;
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");

        int i = 2;

        while (true){
            arr[i] = arr[i-1] + arr[i-2];
            System.out.print(arr[i] + " ");

            if(arr[i]>100){
                break;
            }
            i++;
        }

    }
}