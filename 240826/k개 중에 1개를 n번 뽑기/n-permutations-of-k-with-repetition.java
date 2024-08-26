import java.util.Scanner;
import java.io.*;

public class Main {
    
    public static int k;
    public static int n;
    public static int[] arr;

    public static void promising(int pos, int num){

        arr[pos] = num;
        if (pos+1 == n){
            print();
            return;
        }

        for (int i=1; i<=k; i++){
            promising(pos+1, i);
        }

    }

    public static void print(){
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return;
    }


    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];

        for (int i=1; i<=k; i++){
            int pos = 0;
            promising(pos, i);
        }
    }
}