import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mois = sc.nextInt();

        if (mois <= 2 || mois == 12){
            System.out.print("Winter");
        } else if (mois<= 5){
            System.out.print("Spring");
        } else if (mois <= 8){
            System.out.print("Summer");
        } else{
            System.out.print("Fall");
        }
    }
}