import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char coldA = sc.next().charAt(0);
        int tempA = sc.nextInt();
        char coldB = sc.next().charAt(0);
        int tempB = sc.nextInt();
        char coldC = sc.next().charAt(0);
        int tempC = sc.nextInt();

        int num = 0;

        if (coldA == 'Y' && tempA>= 37){
            num += 1;
        }
        if (coldB == 'Y' && tempB>= 37){
            num += 1;
        }
        if (coldC == 'Y' && tempC>= 37){
            num += 1;
        }

        if (num >=2){
            System.out.print('E');
        } else{
            System.out.print('N');
        }

    }
}