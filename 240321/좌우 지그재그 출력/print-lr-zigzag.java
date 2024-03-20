import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            if (i%2 != 0){
                for (int j= i*n-(n-1); j<=i*n; j++){
                    System.out.print(j+ " ");
                }
            } else{
                for (int j= i*n; j>=i*n-(n-1); j--){
                    System.out.print(j+ " ");
                }
            }
            System.out.println();
        }
    }
}