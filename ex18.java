/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: Fatorial
* Data: 21/05/2023
*/

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        teclado.close();

        if (numero == 0) {
            System.out.println(1);
        } else {
            int fatorial = 1;

            for (int i = 1; i <= numero; i += 1) {
                fatorial = fatorial * i;
            }

            System.out.println(fatorial);
        }

    }
}