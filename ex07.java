/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: Hospedagem hotel
* Data: 21/05/2023
*/

import java.util.Scanner;

public class ex07 {
    public static void main(String[] agrs) {
        int diarias, valorDiarias, valorTotal;
        double taxa;

        System.out.println("Insira a quantidade de diárias");
        Scanner teclado = new Scanner(System.in);
        diarias = teclado.nextInt();
        teclado.close();

        if (diarias > 15) {
            taxa = diarias * 5.50;
            valorDiarias = diarias * 60;
            valorTotal = (int) taxa + valorDiarias;
            System.out.println("O valor total da hospedagem é R$" + valorTotal);
        } else if (diarias == 15) {
            taxa = diarias * 6;
            valorDiarias = diarias * 60;
            valorTotal = (int) taxa + valorDiarias;
            System.out.println("O valor total da hospedagem é R$" + valorTotal);
        } else if (diarias < 15) {
            taxa = diarias * 8;
            valorDiarias = diarias * 60;
            valorTotal = (int) taxa + valorDiarias;
            System.out.println("O valor total da hospedagem é R$" + valorTotal);
        }

    }
}