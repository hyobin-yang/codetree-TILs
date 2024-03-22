import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 65;

        for(int i=n; i>=1; i--){
            for (int j=0; j<n-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                if ((char)cnt == 'Z'){
                    System.out.print((char)cnt + " ");
                    cnt = 65;
                } else{
                    System.out.print((char)cnt + " ");
                    cnt ++;
                }
                
            }
            System.out.println();
        }
        
    }
}