import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int s_len = s.length();

        String new_s = s.substring(0, 1) + 'a' + s.substring(2, s_len-2) + 'a' + s.substring(s_len-1, s_len);

        System.out.print(new_s);
    }
}