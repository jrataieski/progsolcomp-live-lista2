/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: Nota Conceito
* Data: 21/05/2023
*/

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        int nota;
        System.out.println("Entre com a nota");
        Scanner teclado = new Scanner(System.in);
        nota = teclado.nextInt();
        teclado.close();

        if (nota <= 49) {
            System.out.println("Insuficiente");
        } else if (nota <= 64) {
            System.out.println("Regular");
        } else if (nota <= 84) {
            System.out.println("Bom");
        } else if (nota <= 100) {
            System.out.println("Ótimo");
        }

    }

}
