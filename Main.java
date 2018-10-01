import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame 5 numeros");
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length ; i++) {
            int numero=teclado.nextInt();
            numeros[i]=numero;
        }
        int mespetit=Integer.MAX_VALUE;
        for (int i = 0; i < numeros.length ; i++) {
            if (numeros[i]<mespetit){
                mespetit=numeros[i];
            }
        }
        System.out.println("El numero mas pequeño es: "+mespetit);
    }
}
