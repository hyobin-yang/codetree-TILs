import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            if (i>10 && i<100){
                if (i%10 == 3 || i%10 == 6 || i%10 == 9 || i%3==0){
                    System.out.print(0+" ");
                } else if (i/30==1 || i/60==1 || i/90==1){
                    System.out.print(0+" ");
                } else{
                    System.out.print(i+" ");
                }
            } else{
                if (i%3==0){
                    System.out.print(0+ " " );
                } else{
                    System.out.print(i + " ");
                }
            }
        }

    }
}