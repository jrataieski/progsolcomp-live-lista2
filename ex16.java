/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: Menor que 0
* Data: 21/05/2023
*/

import java.util.Scanner;

public class ex16 {
    public static void main (String [] args){
       
        System.out.println("Olá! Digite um número");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        teclado.close();
        while (num >= 0){
            System.out.println("Digite um número");
             num = teclado.nextInt();
        }
        System.out.println("Número válido, obrigada.");




    }

 }

