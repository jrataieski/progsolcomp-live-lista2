/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: Múltiplo de 7
* Data: 21/05/2023
*/

public class ex12 {
    public static void main(String [] args){
        int i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i % 7 != 0 || i / 7 < 2);
    }
}