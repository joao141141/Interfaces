package smart.telefone.apps;

import java.util.Random;
import java.util.Scanner;

public class Discador {

    int seletorMenuDiscador;
    int fecharDiscador;
    float numeroDiscado;
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
            System.out.println("4 - Status da chamada");
            System.out.println("5 - Sair");

            switch (seletorMenuDiscador = scanner.nextInt()) {
                case 1: {
                    discarNumero();
                    break;
                }
                case 2: {
                    AtenderChamada();
                    break;

                }
                case 3: {
                    EncerrarChamada();
                    break;
                }
                case 4: {
                    StatusChamada();
                    break;
                }
            }
        } while (fecharDiscador == 5 || chamadaAtiva == true);
    }

    private void discarNumero() {
        boolean atendeu;
        boolean continuarTentando;
        int tentativasRealizadas = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Disque o numero desejado: ");
        numeroDiscado = scanner.nextInt();
        System.out.println("Discando para " + numeroDiscado);
        if (numeroDiscado == 911 || numeroDiscado == 190 || numeroDiscado == 193 || numeroDiscado == 192) {
            System.out.println("Chamada de emergência!");
        } else {
            do {

                //elas precisarão sofrer alteraçoes.
                atendeu = atender();
                continuarTentando = !atendeu;

                if (continuarTentando) {
                    tentativasRealizadas++;
                } else {
                    System.out.println("Contato Realizado com sucesso!");
                }
            } while (continuarTentando && tentativasRealizadas < 10);

            if (atendeu) {
                System.out.println("A chamada foi atendida com sucesso!");
                chamadaAtiva = true;
            } else {
                System.out.println("Chamada não atendida!");
                chamadaAtiva = false;
            }
        }

    }

    private void AtenderChamada() {
        if (chamadaAtiva) {
            System.out.println("Chamada atendida!");
        } else {
            System.out.println("Não há chamada ativa!");
        }
    }

    private void EncerrarChamada() {
        if (chamadaAtiva) {
            System.out.println("Chamada encerrada!");
            chamadaAtiva = false;
        } else {
            System.out.println("Não há chamada ativa!");
        }
    }

    private void StatusChamada() {
        if (chamadaAtiva) {
            System.out.println("Chamada ativa!");
        } else {
            System.out.println("Não há chamada ativa!");
        }
    }

    static boolean atender() {
        return new Random().nextInt(10) == 1;
    }
}
