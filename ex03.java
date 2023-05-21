/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: Números múltiplos
* Data: 21/05/2023
*/

import java.util.Scanner;

public class ex03{
    public static void main(String[]args){
        System.out.println("Digite o valor de A");
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        System.out.println("Digite o valor de B");
        int b = teclado.nextInt();
        teclado.close();

        if (a % b == 0 || b % a == 0 ){
            System.out.println("Números múltiplos");

        }else{
            System.out.println("Números não são múltiplos");
        }
    }

}



