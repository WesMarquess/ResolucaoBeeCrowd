import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {

        /*
        Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
        o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e
        mostre o valor a ser pago.
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o codigo da peca 1");
        int cod1 = input.nextInt();
        System.out.println("Digite o codigo da peca 1");
        int numerosPecas1 = input.nextInt();
        System.out.println("Digite o valor unitario de cada peca 1");
        double valorUnitarioPeca1 = input.nextDouble();

        System.out.println("Digite o codigo da peca 2");
        int cod2 = input.nextInt();
        System.out.println("Digite o codigo da peca 2");
        int numerosPecas2 = input.nextInt();
        System.out.println("Digite o valor unitario de cada peca 2");
        double valorUnitarioPeca2 = input.nextDouble();

        double valorFinalPeca1 = numerosPecas1 * valorUnitarioPeca1;
        double valorFinalPeca2 = numerosPecas2 * valorUnitarioPeca2;

        System.out.printf("VALOR A PAGAR : R$ %.2f ", valorFinalPeca1 + valorFinalPeca2);
    }
}
