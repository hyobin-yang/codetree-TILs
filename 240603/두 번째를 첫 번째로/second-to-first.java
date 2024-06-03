import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String second = s.substring(1, 2);
        String new_s = "";

        for (int i=0; i<s.length(); i++){
            if(s.substring(i, i+1).equals(second)){
                new_s += s.substring(0, 1);
            } else{
                new_s += s.substring(i, i+1);
            }
        }

        System.out.print(new_s);

    }
}