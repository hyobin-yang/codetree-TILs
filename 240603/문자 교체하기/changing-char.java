import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        String new_s = s1.substring(0, 2) + s2.substring(2, s2.length());

        System.out.print(new_s);
    }
}