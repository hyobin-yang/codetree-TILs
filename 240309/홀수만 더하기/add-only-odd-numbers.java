import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i=1; i<=n; i++){
            int num = sc.nextInt();

            if (num%2!=0 && num%3==0){
                sum += num;
            }
        }

        System.out.print(sum);
    }
}