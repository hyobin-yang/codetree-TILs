import java.util.Scanner;

public class Main {
    
    private static boolean game369(int n){
        
        String tmp = n + "";

        if (n%3 == 0){
            return true;
        } else {
            return check389(tmp);
        }
    }

    private static boolean check389(String tmp){
        
        for (int i=0; i<tmp.length(); i++){
            if (tmp.charAt(i) == '3' || tmp.charAt(i) == '6' || tmp.charAt(i) == '9'){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for (int i=a; i<=b; i++){
            if (game369(i)){
                cnt += 1;
            }
        }

        System.out.println(cnt);
    }
}