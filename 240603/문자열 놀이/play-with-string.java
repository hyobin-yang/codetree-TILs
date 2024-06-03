import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();
        int n;

        for (int i=0; i<q; i++){
            n = sc.nextInt();

            String new_s = "";
            if (n == 1){
                int a = sc.nextInt();
                int b = sc.nextInt();
                a -= 1;
                b -= 1;
                // if (b == s.length()-1){
                //     new_s += s.substring(0, a) + s.substring(b, b+1) + s.substring(a+1, b) + s.substring(a, a+1);
                // } else{
                //     new_s += s.substring(0, a) + s.substring(b, b+1) + s.substring(a+1, b) + s.substring(a, a+1) + s.substring(b+1, s.length());
                // }
                if (a<b){
                    new_s += s.substring(0, a) + s.substring(b, b+1) + s.substring(a+1, b) + s.substring(a, a+1) + s.substring(b+1, s.length());
                } else{
                    new_s += s.substring(0, b) + s.substring(a, a+1) + s.substring(b+1, a) + s.substring(b, b+1) + s.substring(a+1, s.length());
                }
                System.out.println(new_s);
                s = new_s;
            } else{
                String a = sc.next();
                String b = sc.next();
                for (int j=0; j<s.length(); j++){
                    if (s.substring(j, j+1).equals(a)){
                        new_s += b;
                    } else{
                        new_s += s.substring(j, j+1);
                    }
                }
                System.out.println(new_s);
                s = new_s;
            }
        }
    }
}