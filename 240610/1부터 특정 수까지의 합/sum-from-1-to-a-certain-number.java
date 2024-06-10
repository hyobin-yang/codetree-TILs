import java.util.Scanner;

public class Main {
    
    private static int add(int n){

        if (n==0){
            return 0;
        } else{
            return n + add(n-1);
        }
        
    }
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(add(n)/10);
    }
}