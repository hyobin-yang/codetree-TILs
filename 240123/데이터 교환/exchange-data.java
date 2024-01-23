public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int tmp1 = b;
        int tmp2 = c;

        b = a;
        c = tmp1;
        a = tmp2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}