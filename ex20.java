/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: Carga elevador
* Data: 21/05/2023
*/

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.close();
        int pesoMaximo = teclado.nextInt();
        int quantidadePessoasMax = teclado.nextInt();
        int quantidadePessoas = 0;
        int somaPeso = 0;

        do {
            int peso = teclado.nextInt();

            somaPeso += peso;
            quantidadePessoas += 1;
        } while (somaPeso <= pesoMaximo && quantidadePessoas <= quantidadePessoasMax);

        System.out.println("Peso: " + somaPeso + " Pessoas: " + quantidadePessoas);

    }
}