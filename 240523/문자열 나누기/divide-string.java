import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = "";

        for (int i=0; i<n; i++){
            s += sc.next();
        }

        int m = s.length()/5;

        int tmp = 0;
        for (int i=0; i<m; i++){
            for (int j=0; j<5; j++){
                System.out.print(s.charAt(tmp));
                tmp ++;
            }
            System.out.println();
        }

        for (int i=tmp; i<s.length(); i++){
            System.out.print(s.charAt(i));
        }


    }
}