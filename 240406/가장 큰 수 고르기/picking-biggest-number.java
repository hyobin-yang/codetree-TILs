import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp = 0;
        int num = 0;

        for (int i=0; i<10; i++){
            num = sc.nextInt();
            if (num > tmp){
                tmp = num;
            }
        }

        System.out.print(tmp);
        
    }
}