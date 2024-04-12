import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int cnt = 1;
        String result = "";

        for (int i=1; i<a.length(); i++){
            if (i != a.length()-1 && a.charAt(i) == a.charAt(i-1)){
                cnt ++;
            } else if (a.charAt(i) != a.charAt(i-1)){
                result += a.charAt(i-1) + Integer.toString(cnt);
                cnt = 1;
            } else if (i == a.length()-1 && a.charAt(i) == a.charAt(i-1)){
                cnt ++;
                result += a.charAt(i) + Integer.toString(cnt);
            } else{
                result += a.charAt(i) + "1";
            }
        }

        System.out.println(result.length());
        System.out.print(result);
    }
}