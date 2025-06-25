import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {

        /*
        Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
        diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
         */
        Scanner input = new Scanner(System.in);
        int A, B, C, D, DIFERENCA;

        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
