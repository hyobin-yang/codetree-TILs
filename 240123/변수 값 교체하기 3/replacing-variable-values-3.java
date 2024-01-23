public class Main {
    public static void main(String[] args) {
        int a = 3, b = 5;
        int tmp = b;
        b = a;
        a = tmp;

        System.out.println(a);
        System.out.println(b);
    }
}