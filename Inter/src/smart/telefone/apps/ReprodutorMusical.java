package smart.telefone.apps;

import java.util.Scanner;

public class ReprodutorMusical {

    public static String musica;
    public static int seletorMenuPrincipal;
    public static boolean versaoPremium;

    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.iniciarReprodutor();
    }

    public void iniciarReprodutor() {

        Scanner scanner = new Scanner(System.in);

        do {
            ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

            System.out.println("Bem vindo ao Reprodutor Musical!");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Selecionar música");
            System.out.println("2 - Tocar música");
            System.out.println("3 - Parar música");
            System.out.println("4 - Avançar música");
            System.out.println("5 - Voltar música");
            System.out.println("6 - Lista de músicas");
            System.out.println("7 - Comprar versão Premim Plus Master Blaster");
            System.out.println("8 - Sair");

            seletorMenuPrincipal = scanner.nextInt();
            switch (seletorMenuPrincipal) {
                case 1: {
                    reprodutorMusical.selecionarMusica();
                    tocarMusica();
                    break;
                }
                case 2: {
                    tocarMusica();
                    break;
                }
                case 3: {
                    pararMusica();
                    break;
                }
                case 4: {
                    avancarMusica();
                    break;
                }
                case 5: {
                    voltarMusica();
                    break;
                }
                case 6: {
                    listaDeMusicas();
                    break;
                }
                case 7: {
                    comprarPremium();
                }
            }
        } while (seletorMenuPrincipal != 8);

    }

    private void selecionarMusica() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira aqui a musica que tu deseja tocar: ");
        musica = scanner.nextLine();
        System.out.println("Musica selecionada: " + musica);
    }

    private static void tocarMusica() {
        System.out.println("Tocando: " + musica);
    }

    private static void pararMusica() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você deseja parar a musica? (S/N)");
        scanner.nextLine().equalsIgnoreCase("S");
        if (musica == null) {
            System.out.println("Nenhuma música tocando");
            return;
        } else if (musica != null) {
            System.out.println("Você deseja parar a musica: " + musica + " ?" + " (S/N)");
            String parada = scanner.nextLine();
            if (parada.equalsIgnoreCase("S")) {
                musica = null;
            } else {
                System.out.println("A música continuará tocando:" + musica);
            }
        }

    }

    private static void avancarMusica() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Avançando música");
        System.out.println("Insira a proxima música: ");
        musica = scanner.nextLine();
        System.out.println("Tocando: " + musica);
    }

    private static void voltarMusica() {

        if (versaoPremium = true) {
            System.out.println("Estamos trabalhando na atualização, aguarde.");
        } else {
            System.out.println("Para voltar a musica, pague a versão Premium Plus Master Blaster. :)");
        }

    }

    private static void listaDeMusicas() {
        if (versaoPremium == true) {
            System.out.println("Estamos trabalhando na atualização, aguarde.");
        } else {
            System.out.println("Para mostrar sua lista de musicas, pague a versão Premium Plus Master Blaster. :)");
        }

    }

    private static void comprarPremium() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você deseja comprar a versão Premium?");
        String comprar = scanner.nextLine();
        if (comprar.equalsIgnoreCase("S")) {
            int looping = 100;
            int comprando = 0;
            do {
                comprando++;
                System.out.println("Comprando...");
            } while (comprando < looping);
        } else {
            System.out.println("Comprou esse smart pra que?");

            System.out.println("Versão Premium comprada com sucesso!");
        }
    }

    private static void erro() {
        System.out.println("Opção inválida, tente novamente.");
    }
}
