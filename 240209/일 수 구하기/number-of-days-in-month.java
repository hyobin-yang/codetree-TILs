import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2){
            System.out.print(28);
        } else if( (n<8 && n%2 != 0) || (n>=8 && n%2==0)){
            System.out.print(31);
        } else{
            System.out.print(30);
        }

    }
}