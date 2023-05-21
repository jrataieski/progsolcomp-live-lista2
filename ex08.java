/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: Mês e estação
* Data: 21/05/2023
*/

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) throws Exception {

        int mes;
        System.out.println("Digite um número");
        Scanner teclado = new Scanner(System.in);
        mes = teclado.nextInt();
        teclado.close();
        switch (mes) {
            case 1:
                System.out.println("Mês: Janeiro – Estação: Verão");
                break;
            case 2:
                System.out.println("Mês: Fevereiro – Estação: Verão");
                break;
            case 3:
                System.out.println("Mês: Março – Estação: Verão");
                break;
            case 4:
                System.out.println("Mês: Abril – Estação: Outono");
                break;
            case 5:
                System.out.println("Mês: Maio – Estação: Outono");
                break;
            case 6:
                System.out.println("Mês: Junho – Estação: Inverno");
                break;
            case 7:
                System.out.println("Mês: Julho – Estação: Inverno");
                break;
            case 8:
                System.out.println("Mês: Agosto – Estação: Inverno");
                break;
            case 9:
                System.out.println("Mês: Setembro – Estação: Primavera");
                break;
            case 10:
                System.out.println("Mês: Outubro – Estação: Primavera");
                break;
            case 11:
                System.out.println("Mês: Novembro – Estação: Primavera");
                break;
            case 12:
                System.out.println("Mês: Dezembro – Estação: Verão");
                break;
            default:
                System.out.println("O número escolhido é inválido! Digite um número entre 1 a 12.");
        }
    }
}
