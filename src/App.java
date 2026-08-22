/*TESTE DE ESTRUTURA REPETITIVAS COM SOMA*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int numero = sc.nextInt();

        while (numero > 0){
            soma = soma + numero;
            numero = sc.nextInt();
        }

        System.out.println("SOMA: " + soma);

        sc.close();
    }
}
