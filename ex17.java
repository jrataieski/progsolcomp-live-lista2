/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: Múltiplos negativos de 7
* Data: 21/05/2023
*/

public class ex17 {
    public static void main(String[] args) {
        int numero = -1;

        do {
            if (numero % 7 == 0) {
                System.out.println(numero);
            }

            numero -= 1;
        } while (numero > -1000);
    }
}