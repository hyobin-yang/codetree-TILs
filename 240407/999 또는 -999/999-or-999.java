import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minVal = 999;
        int maxVal = -999;
        int tmp = 0;

        while(true){
            tmp = sc.nextInt();
            if (tmp == 999 || tmp==-999){
                break;
            }
            if (tmp>maxVal){
                maxVal = tmp;
            }
            if (tmp<minVal){
                minVal = tmp;
            }
        }
        System.out.print(maxVal + " " + minVal);
    }
}