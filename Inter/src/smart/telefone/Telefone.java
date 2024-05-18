package smart.telefone;

import java.util.Scanner;
import smart.telefone.apps.Discador;
import smart.telefone.apps.Navegador;
import smart.telefone.apps.ReprodutorMusical;

public class Telefone {

    public static int opcaoUser;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Bem vindo ao seu telefone inteligente!");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Reprodutor Musical");
            System.out.println("2 - Discador");
            System.out.println("3 - Navegador");
            opcaoUser = scanner.nextInt();
            switch (opcaoUser) {
                case 1: {
                    ReprodutorMusical app1 = new ReprodutorMusical();
                    app1.iniciarReprodutor();
                    break;
                }
                case 2: {
                    Discador app2 = new Discador();
                    app2.iniciarDiscador();
                }
                case 3: {
                    Navegador app3 = new Navegador();
                    app3.iniciarNavegador();
                    break;
                }

            }

        } while (opcaoUser != 6);
        System.out.println("Obrigado por usar o seu telefone inteligente!");
    }
}
