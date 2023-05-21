/* Nome: Júlia Salvi Rataieski
* RA: 1292315016
* Nome do Programa: Informações do usuário
* Data: 21/05/2023
*/

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) throws Exception {
        String nome, sobrenome, naturalidade;
        int idade;
        char opcao;
        System.out.println("Olá! Qual o seu nome?");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        Scanner teclado2 = new Scanner(System.in);
        nome = teclado.next();
        System.out.println("E qual o seu sobrenome?");
        sobrenome = teclado.next();
        System.out.println("Qual a sua cidade de nascimento?");
        naturalidade = teclado.next();
        System.out.println("Qual a sua idade?");
        idade = teclado2.nextInt();
        System.out.println("Deseja visualizar dados completos? Digite S para Sim e N para Não.");
        opcao = teclado.next().charAt(0);
        teclado.close();
        teclado2.close();

        if (opcao == 'S') {
            System.out.println(nome + "\n" + sobrenome + "\n" + idade + "\n" + naturalidade);
        } else if (opcao == 'N') {
            System.out.println(nome + "\n" + idade);
        } else {
            System.out.println("Digitação errada. Tente novamente.");
        }

    }

}
