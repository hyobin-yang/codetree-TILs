import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int result = 0;

        for (int i=1; i<=m; i++){
            int n = sc.nextInt();
            while(n!=1){
            if (n%2 == 0){
                n /=2;
            } else{
                n = n*3 + 1;
            }
            result ++;
            }
            System.out.print(result);
        }
    }
}