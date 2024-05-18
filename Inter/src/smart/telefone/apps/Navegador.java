package smart.telefone.apps;

import java.util.Scanner;

public class Navegador {

    String url;
    int seletorMenuNavegador;
    int abasAbertas = 1;

    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        navegador.iniciarNavegador();
    }

    public void iniciarNavegador() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bem vindo ao Navegador!");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Abrir url");
            System.out.println("2 - Abir aba");
            System.out.println("3 - Fechar aba");
            System.out.println("4 - Fechar navegador");
            indicadorDeabasAbertas();
            seletorMenuNavegador = scanner.nextInt();
            switch (seletorMenuNavegador) {
                case 1: {
                    abrirUrl();
                    break;
                }
                case 2: {
                    abrirAba();
                    break;
                }
                case 3: {
                    fecharAba();
                    break;
                }

            }
        } while (seletorMenuNavegador != 4);

    }

    private void abrirUrl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a url que deseja acessar:");
        url = scanner.nextLine();
        System.out.println("Acessando " + url);
        System.out.println("Url acessada com sucesso!");
    }

    private void abrirAba() {
        abasAbertas++;
        System.out.println("Aba aberta com sucesso!");
    }

    private void indicadorDeabasAbertas() {
        System.out.println("Abas abertas: " + abasAbertas);
    }

    private void fecharAba() {
        abasAbertas--;
        System.out.println("Aba fechada com sucesso!");
    }
}
