package main;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import main.aquecimento.Desafio;

public class Main {

    public static void main(String[] args) {
        int escolhaMenu = -1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Informe a opção desejada:");
            System.out.println("1 - Imprimir triângulo");
            System.out.println("2 - Imprimir retângulo");
            System.out.println("3 - Verificar equilibrio de equação");
            System.out.println("4 - Imprime Tokenização");
            System.out.println("5 - Imprime Conjuntos União/Interseção");
            System.out.println("6 - Verificar trava lógica");
            System.out.println("0 - Sair");

            String entrada = scanner.nextLine().trim();

            try {
                escolhaMenu = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida! Digite um número (0 a 4).\n");
                continue;
            }

            switch (escolhaMenu) {
                case 1:
                    imprimeTriangulo(scanner);
                    break;
                case 2:
                    imprimeRetangulo(scanner);
                    break;
                case 3:
                    imprimeEquilibrioEquacao(scanner);
                    break;
                case 4:
                    imprimeTokenizacao(scanner);
                    break;
                case 5:
                	imprimeConjuntosUniaoEIntersecao();
                    break;
                case 6:
                	imprimeTravaLogica(scanner);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida! Digite um número (0 a 4).\n");
            }

        } while (escolhaMenu != 0);

        scanner.close();
        System.out.println("Execução finalizada.");
    }

    private static void imprimeTriangulo(Scanner scanner) {
        System.out.println("Informe a altura do triângulo:");
        int alturaTriangulo = lerInt(scanner);
        new Desafio().imprimeTrianguloRetangulo(alturaTriangulo);
    }

    private static void imprimeRetangulo(Scanner scanner) {
        System.out.println("Informe a altura do retângulo:");
        int alturaRetangulo = lerInt(scanner);

        System.out.println("Informe a largura do retângulo:");
        int larguraRetangulo = lerInt(scanner);

        new Desafio().imprimeRetanguloEDiagonalSuperiorDireita(alturaRetangulo, larguraRetangulo);
    }

    private static void imprimeEquilibrioEquacao(Scanner scanner) {
        System.out.println("Informe a expressão numérica:");
        String expressao = scanner.nextLine(); 

        boolean expressaoValida = Desafio.verificaEquilibioEquacao(expressao);

        System.out.println(expressaoValida ? "Expressão válida." : "Expressão inválida.");
        System.out.println();
    }

    private static void imprimeTokenizacao(Scanner scanner) {
        System.out.println("Informe a expressão:");
        String expressao = scanner.nextLine(); 

        Desafio.imprimeTokenizacao(expressao);
        System.out.println();
    }

    private static int lerInt(Scanner scanner) {
        while (true) {
            String s = scanner.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número inteiro:");
            }
        }
    }
    
    private static void imprimeConjuntosUniaoEIntersecao() {
    	ArrayList<Integer> A = new ArrayList<>(java.util.Arrays.asList(1, 2, 3));
    	ArrayList<Integer> B = new ArrayList<>(java.util.Arrays.asList(2, 3, 4));

    	Map<String, ArrayList<Integer>> r = Desafio.conjuntosUniaoEIntersecao(A, B);

    	System.out.println("União: " + r.get("uniao"));
    	System.out.println("Interseção: " + r.get("intersecao"));
    	System.out.println();
    	System.out.println();
    }
    
    private static void imprimeTravaLogica(Scanner scanner) {
        System.out.println("Informe a entrada:");
        String entrada = scanner.nextLine(); 

        boolean travaVerificada = Desafio.travaLogica(entrada);
        if(travaVerificada) {
        	System.out.println("Acesso permitido");
        }else {
        	System.out.println("Acesso negado");
        }
        System.out.println();
        System.out.println();
    }
}