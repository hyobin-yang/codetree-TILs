import java.util.Scanner;

public class Main {
    
    private static String check(int year){

        if (year%100 == 0 && year%400 != 0){
            return "false";
        } else if (year % 4 == 0){
            return "true";
        } else{
            return "false";
        }
    }
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        System.out.print(check(y));
    }
}