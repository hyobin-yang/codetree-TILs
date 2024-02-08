import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maA = sc.nextInt(), enA = sc.nextInt();
        int maB = sc.nextInt(), enB = sc.nextInt();

        if (maA==maB){
            System.out.print(enA>enB ? "A" : "B");
        } else{
            System.out.print(maA>maB ? "A" : "B");

        }
    }
}