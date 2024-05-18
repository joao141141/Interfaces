package smart.telefone.apps;

import java.util.Scanner;

public class Discador {

    int seletorMenuDiscador;
    int fecharDiscador;
    int numeroDiscado;
    boolean encerrarChamada;
    boolean chamadaAtiva;
    boolean chamadaRecebida;

    public static void main(String[] args) {

        Discador discador = new Discador();
        discador.iniciarDiscador();
    }

    public void iniciarDiscador() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bem vindo ao Discador!");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Discar número");
            System.out.println("2 - Atender chamada");
            System.out.println("3 - Encerrar chamada");
            System.out.println("4 - Sair");

            switch (seletorMenuDiscador = scanner.nextInt()) {
                case 1: {
                    discarNumero();
                    break;
                }
            }
        } while (fecharDiscador != 4);
    }

    private void discarNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Disque o numerio desejado: ");
        numeroDiscado = scanner.nextInt();
        System.out.println("Discando para " + numeroDiscado);

    }

}
