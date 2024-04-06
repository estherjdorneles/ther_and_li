import Login.User;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // variaveis de usuário
        String nome;
        String dataNasc;
        String email;
        String senha;

        System.out.println("Hello world and Li!");
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Data de Nascimento: ");
        dataNasc = leia.nextLine();
        System.out.println("Informe seu e-mail: ");
        email = leia.nextLine();
        System.out.println("Digite sua senha: ");
        senha = leia.nextLine();
        User u1 = new User(nome, email);
        u1.toString();
    }

}