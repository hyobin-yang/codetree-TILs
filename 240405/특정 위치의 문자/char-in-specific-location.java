import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};

        char c = sc.next().charAt(0);

        for (int i=0; i<6; i++){
            if (arr[i] == c){
                System.out.print(i);
                break;
            }
            if (i==5){
                System.out.print("None");
            }
        }
    }
}