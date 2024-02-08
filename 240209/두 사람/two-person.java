import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageA = sc.nextInt();
        char sexA = sc.next().charAt(0);
        int ageB = sc.nextInt();
        char sexB = sc.next().charAt(0);

        System.out.print( (ageA>=19 && sexA=='M') || (ageB>=19 && sexB=='M') ? 1 : 0);


    }
}