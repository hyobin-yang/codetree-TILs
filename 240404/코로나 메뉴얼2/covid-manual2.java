import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        for (int i=0; i<3; i++){
            char symptom = sc.next().charAt(0);
            int temp = sc.nextInt();

            if (temp >=37 && symptom == 'Y'){
                a ++;
                e ++;
            } else if(temp >=37){
                b ++;
            } else if (symptom == 'Y'){
                c ++;
            } else {
                d ++;
            }
        }

        System.out.print(a + " " + b + " " + c + " " + d + " ");
        if(e>=2){
            System.out.print('E');
        }
    }
}