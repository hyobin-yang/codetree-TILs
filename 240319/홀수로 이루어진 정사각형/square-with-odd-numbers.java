import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp_i = 11;

        for (int i=0; i<n; i++){
            int tmp_j = tmp_i;
            for (int j=0; j<n; j++){
                System.out.print(tmp_j + " ");
                tmp_j += 2;
            }
            System.out.println();
            tmp_i += 2;
        }
    }
}