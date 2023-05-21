/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: Par ou ímpar
* Data: 21/05/2023
*/

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        int num;
        System.out.println("Informe um número");
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt();
        teclado.close();

        if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
        if (num >= 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }

    }
}
