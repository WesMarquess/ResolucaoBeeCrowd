import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        /*
        Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno,
        sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de
        0 até 10.0, sempre com uma casa decimal.
        */

        Scanner input = new Scanner(System.in);

        float a = input.nextFloat() * (2);
        float b = input.nextFloat() * (3);
        float c = input.nextFloat() * (5);
        float MEDIA = (a + b + c) / 10;
        System.out.printf("MEDIA = %.1f ", MEDIA);
    }
}
