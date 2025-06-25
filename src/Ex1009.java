import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {

    /*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
    Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no
    final do mês, com duas casas decimais.
    */
        Scanner input = new Scanner(System.in);

        int comissao = 15;

        System.out.println("Digite o nome do vendedor");
        String nomeVendedor = input.next();

        System.out.println("Digite o seu salario fixo");
        double salarioFixo = input.nextDouble();

        System.out.println("Digite o total de vendas (em dinheiro)");
        double totalVendasEmDinheiro = input.nextDouble();

        double comissaoFinal = (totalVendasEmDinheiro * 15) / 100;
        double salarioFinal = salarioFixo + comissaoFinal;

        System.out.printf("Salario a receber = %.2f ", salarioFinal);

    }
}
