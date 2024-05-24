import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String target = sc.next();
        String part = sc.next();

        int tLength = target.length();
        int pLength = part.length();

        boolean b = false;

        for (int i=0; i<tLength-pLength+1; i++){
            if(target.substring(i, i+pLength).equals(part)){
                System.out.print(i);
                b = true;
                break;
            }
        }

        if(b == false){
            System.out.print(-1);
        }
    }
}