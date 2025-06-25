import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {

        /*
        Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
        o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
         */

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int horasTrabalhadas = input.nextInt();
        double salarioPorHora = input.nextDouble();

        double salarioFinal = (salarioPorHora * horasTrabalhadas);

        System.out.printf("Salario final = R$ %.2f ", salarioFinal);


    }
}
