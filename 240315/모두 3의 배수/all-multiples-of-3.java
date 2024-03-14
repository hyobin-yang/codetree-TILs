import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean satisfied = true;

        for (int i=1; i<=5; i++){
            int tmp = sc.nextInt();
            if (tmp%3!=0){
                satisfied = false;
            }
        }

        if (satisfied == true){
            System.out.print(1);
        } else{
            System.out.print(0);
        }
    }
}