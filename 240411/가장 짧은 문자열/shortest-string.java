import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minVal = 20;
        int maxVal = 0;

        String s;

        for (int i=0; i<3; i++){
            s = sc.next();

            if (s.length()<minVal){
                minVal = s.length();
            }
            if (s.length()>maxVal){
                maxVal = s.length();
            }
        }


        System.out.print(maxVal - minVal);
    }
}