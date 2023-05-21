/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: Maior número
* Data: 21/05/2023
*/

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        int n1, n2;
        System.out.println("Digite um número");
        Scanner teclado = new Scanner(System.in);
        n1 = teclado.nextInt();
        System.out.println("Digite outro número");
        n2 = teclado.nextInt();
        teclado.close();
        if (n1 > n2) {
            System.out.println("O número maior é " + n1);
        } else {
            System.out.println("O número maior é " + n2);
        }
    }
}
