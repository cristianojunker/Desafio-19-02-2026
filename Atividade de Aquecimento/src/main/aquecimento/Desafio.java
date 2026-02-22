package main.aquecimento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Desafio {
	public void imprimeTrianguloRetangulo(int altura) {
		System.out.println("");
		System.out.println("========== TRIÂNGULO ==========");
		System.out.println("");
		for(int i=0; i<altura; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
				if(j!=i) {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		System.out.println("");
		System.out.println("");
	}
	
	public void imprimeRetanguloEDiagonalSuperiorDireita(int altura, int largura) {
		System.out.println("");
		System.out.println("========== RETÂNGULO ==========");
		System.out.println("");
		for(int i=0; i<altura; i++) {
			for(int j=0; j<largura; j++) {
				if(j!=largura-1) {
					System.out.print("* ");
				}else {
					System.out.println("*");
				}
			}
		}
		System.out.println("");
		System.out.println("========== DIAGONAL SUPERIOR DIREITA ==========");
		System.out.println("");
		for(int i=0; i<altura; i++) {
			for(int j=0; j<largura; j++) {
				if(i>j) {
					System.out.print("  ");
				}else if(j!=largura-1) {
					System.out.print("* ");
				}else {
					System.out.println("*");
				}
			}
		}
		System.out.println("");
		System.out.println("");
	}
	
	public static boolean verificaEquilibioEquacao(String expressao) {
	    Stack<Character> pilha = new Stack<>();

	    for (int i = 0; i < expressao.length(); i++) {
	        char c = expressao.charAt(i);

	        if (c == '(' || c == '[' || c == '{') {
	            pilha.push(c);
	        }else if (c == ')' || c == ']' || c == '}') {
	            if (pilha.isEmpty()) return false;

	            char topo = pilha.peek();

	            boolean parOk =
	                    (c == ')' && topo == '(') ||
	                    (c == ']' && topo == '[') ||
	                    (c == '}' && topo == '{');

	            if (!parOk) 
	            	return false;
	            pilha.pop();
	        }
	    }

	    return pilha.isEmpty();
	}
	
	public static void imprimeTokenizacao(String codigo) {
	    String[] partes = codigo.trim().split("\\s+");

	    for (String token : partes) {
	        boolean temPontoEVirgula = token.endsWith(";");
	        if (temPontoEVirgula) token = token.substring(0, token.length() - 1);

	        if (!token.isEmpty()) {
	            if (token.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
	                System.out.println(token + " -> Identificador");
	            } else if (token.matches("\\d+")) {
	                System.out.println(token + " -> Número");
	            } else if (token.equals("=")) {
	                System.out.println(token + " -> atribuição");
	            } else if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
	                System.out.println(token + " -> Operador");
	            } else {
	                System.out.println(token + " -> Desconhecido");
	            }
	        }

	        if (temPontoEVirgula) {
	            System.out.println("; -> Fim de instrução");
	        }
	    }
	    
	    System.out.println("");
		System.out.println("");
	}
	
	public static Map<String, ArrayList<Integer>> conjuntosUniaoEIntersecao(
	        ArrayList<Integer> A, ArrayList<Integer> B
	) {
	    Set<Integer> uniaoSet = new LinkedHashSet<>();
	    uniaoSet.addAll(A);
	    uniaoSet.addAll(B);

	    Set<Integer> interSet = new LinkedHashSet<>();
	    Set<Integer> bSet = new LinkedHashSet<>(B);

	    for (Integer x : A) {
	        if (bSet.contains(x)) {
	            interSet.add(x);
	        }
	    }

	    Map<String, ArrayList<Integer>> resultado = new HashMap<>();
	    resultado.put("uniao", new ArrayList<>(uniaoSet));
	    resultado.put("intersecao", new ArrayList<>(interSet));
	    return resultado;
	}
	
	public static boolean travaLogica(String entrada) {
	    int estado = 0;

	    for (int i = 0; i < entrada.length(); i++) {
	        char c = entrada.charAt(i);

	        switch (estado) {
	            case 0:
	                if (c == '1') estado = 1;
	                else if (c == '-') { /* ignora */ }
	                else estado = 0;
	                break;

	            case 1:
	                if (c == '-') { /* ignora */ }
	                else if (c == '2') estado = 2;
	                else estado = 0;
	                break;

	            case 2:
	                if (c == '-') { /* ignora */ }
	                else if (c == '3') estado = 3;
	                else estado = 0;
	                break;

	            case 3:
	                if (c != '-') estado = 0;
	                break;
	        }
	    }

	    if (estado == 3) {
	        return true;
	    } else {
	        return false;
	    }
	}
}
