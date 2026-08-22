import java.util.Scanner;

public class senhacorreta {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int senhacorreta = 2002;
        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != senhacorreta){
            System.out.println("Senha Inválida!");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido!");

        sc.close();
    }

}
