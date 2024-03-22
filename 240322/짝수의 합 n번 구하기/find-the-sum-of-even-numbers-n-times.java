import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            int tmp = 0;
            for (int j=a; j<=b; j++){
                if(j%2==0){
                    tmp += j;
                }
            }
            System.out.println(tmp);
        }
    }
}