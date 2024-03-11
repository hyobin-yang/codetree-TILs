import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;

        while (true){
            int age = sc.nextInt();
            
            if (age > 29 || age < 20){
                break;
            } else{
                sum += age;
                cnt += 1;
            }
        }

        System.out.printf("%.2f", (double)sum/cnt);
    }
}