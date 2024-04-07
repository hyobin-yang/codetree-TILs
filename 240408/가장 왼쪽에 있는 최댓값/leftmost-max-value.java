import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int index = n;
        int tmp;
        int pos;

        while (true){
            if (index==0){
                break;
            }
            
            pos = 0;
            tmp = 0;
            for (int i=0; i<index; i++){
                if (arr[i]>tmp){
                    tmp = arr[i];
                    pos = i;
                }
            }
            index = pos;
            System.out.print(pos+1 + " ");
        }



    }
}