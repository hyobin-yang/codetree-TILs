import java.util.Scanner;

public class Main {
    
    private static int sosu(int n){

        if (n==1){
            return 0;
        }
        
        for (int i=2; i<n; i++){
            if (n%i == 0){
                return 0;
            }
        }
        return n;
    }

    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        for (int i=a; i<=b; i++){
            result += sosu(i);
        }

        System.out.print(result);

    }
}