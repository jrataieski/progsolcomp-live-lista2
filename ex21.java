/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: Tabuada
* Data: 21/05/2023
*/

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        teclado.close();

        System.out.println("Tabuada " + numero);

        for (int i = 1; i <= numero; i += 1) {
            System.out.println(i * numero);
        }
    }
}