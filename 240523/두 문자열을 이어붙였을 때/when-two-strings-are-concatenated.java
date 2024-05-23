import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int l = (a+b).length();

        boolean result = true;
        for (int i=0; i<l; i++){
            if ((a+b).charAt(i) != (b+a).charAt(i)){
                result = false;
                break;
            }

        }

        System.out.print(result);
    }
}