/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: Volume
* Data: 21/05/2023
*/

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.close();
        int volumeInicial = teclado.nextInt();
        int segundos = 0;

        while (volumeInicial <= 1000) {
            volumeInicial = volumeInicial * 2;
            segundos += 1;
        }

        System.out.println("Volume final: " + volumeInicial + " Tempo: " + segundos + " segundos");
    }
}