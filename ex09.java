/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: Total da venda
* Data: 21/05/2023
*/

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        double valorVenda, diferenca, valorTotal;
        int opcao;

        System.out.println("Entre com o valor de venda");
        Scanner teclado = new Scanner(System.in);
        valorVenda = teclado.nextDouble();
        teclado.close();

        System.out.println(
                "Escolha a condição de pagamento\nVenda a Vista = 1\nVenda a Prazo 30 dias = 2\nVenda a Prazo 60 dias = 3\nVenda a Prazo 90 dias = 4\nVenda com cartão de débito = 5\nVenda com cartão de crédito = 6");
        opcao = teclado.nextInt();

        if (opcao == 1) {
            diferenca = valorVenda * 0.10;
            valorTotal = valorVenda - diferenca;
            System.out.println("O valor da venda final é R$" + valorTotal);
        } else if (opcao == 2) {
            diferenca = valorVenda * 0.05;
            valorTotal = valorVenda - diferenca;
            System.out.println("O valor da venda final é R$" + valorTotal);
        } else if (opcao == 3) {
            System.out.println("O valor da venda final é R$" + valorVenda);
        } else if (opcao == 4) {
            diferenca = valorVenda * 0.05;
            valorTotal = valorVenda + diferenca;
            System.out.println("O valor da venda final é R$" + valorTotal);
        } else if (opcao == 5) {
            diferenca = valorVenda * 0.08;
            valorTotal = valorVenda - diferenca;
            System.out.println("O valor da venda final é R$" + valorTotal);
        } else if (opcao == 6) {
            diferenca = valorVenda * 0.07;
            valorTotal = valorVenda - diferenca;
            System.out.println("O valor da venda final é R$" + valorTotal);
        }

    }
}
