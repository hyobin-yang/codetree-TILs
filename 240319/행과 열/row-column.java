import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        for (int i=1; i<=a; i++){
            for (int j=i; j<=5*i; j+=i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}