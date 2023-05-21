/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: Ordem crescente
* Data: 21/05/2023
*/

import java.util.Scanner;
import java.text.MessageFormat;

public class ex02 {
    public static void main(String[] args) {
        double a, b, c;

        System.out.println("Insira o valor de A");
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextDouble();
        System.out.println("Insiria o valor de B");
        b = teclado.nextDouble();
        System.out.println("Insira o valor de C");
        c = teclado.nextDouble();
        teclado.close();

        if (a < b && b < c) {
            String text = MessageFormat.format("{0}-{1}-{2}", a, b, c);
            System.out.println(text);
        } else if (b < a && a < c) {
            String text = MessageFormat.format("{0}-{1}-{2}", b, a, c);
            System.out.println(text);
        } else if (b < c && c < a) {
            String text = MessageFormat.format("{0}-{1}-{2}", b, c, a);
            System.out.println(text);
        } else if (c < a && a < b) {
            String text = MessageFormat.format("{0}-{1}-{2}", c, a, b);
            System.out.println(text);
        } else if (c < b && b < a) {
            String text = MessageFormat.format("{0}-{1}-{2}", c, b, a);
            System.out.println(text);
        } else if (a < c && c < b) {
            String text = MessageFormat.format("{0}-{1}-{2}", a, c, b);
            System.out.println(text);
        }

    }
}
/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: 
* Data: 
*/