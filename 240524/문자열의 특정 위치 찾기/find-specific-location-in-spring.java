import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word = sc.next();
        String findC = sc.next();

        if(word.contains(findC)){
            System.out.print(word.indexOf(findC));
        } else{
            System.out.print("No");
        }
    }
}