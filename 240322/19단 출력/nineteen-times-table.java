public class Main {
    public static void main(String[] args) {
        for (int i=1; i<=19; i++){
            for (int j=1; j<=19; j++){
                if (j%2 == 0){
                    System.out.print(" / " + i + " * " + j+ " = " + j*i);
                    System.out.println();
                } else if(j==19){
                    System.out.print(i + " * " + j+ " = " + j*i);
                    System.out.println();

                }else{
                    System.out.print(i + " * " + j+ " = " + j*i);

                }
            }
        }
    }
}