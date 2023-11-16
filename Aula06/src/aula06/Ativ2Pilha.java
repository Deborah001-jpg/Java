package aula06;

import java.util.Scanner;
import java.util.Stack;

public class Ativ2Pilha {

   
	
		    static Stack<String> pilhaLivros = new Stack<>();
		    
		    
		    static Scanner leia = new Scanner(System.in);

		    public static void main(String[] args) {
		        int opcao;

		        do {
		         
		            System.out.println("\n--- Menu ---");
		            System.out.println("1: Adicionar Livro na pilha");
		            System.out.println("2: Listar Livros na pilha");
		            System.out.println("3: Retirar Livro da pilha");
		            System.out.println("0: Sair");

		          
		            System.out.print("Escolha uma opção: ");
		            opcao = leia.nextInt();

		           
		            switch (opcao) {
		                case 1:
		                    adicionarLivro();
		                    break;
		                case 2:
		                    listarLivros();
		                    break;
		                case 3:
		                    retirarLivro();
		                    break;
		                case 0:
		                    System.out.println("Programa finalizado.");
		                    break;
		                default:
		                    System.out.println("Opção inválida. Tente novamente.");
		            }

		        } while (opcao != 0);
		    }

		 
		    private static void adicionarLivro() {
		        System.out.print("Digite o nome do Livro: ");
		        String nomeLivro = leia.next();
		        pilhaLivros.push(nomeLivro);
		        System.out.println("Livro \"" + nomeLivro + "\" adicionado à pilha.");
		    }

		
		    private static void listarLivros() {
		        if (pilhaLivros.isEmpty()) {
		            System.out.println("A pilha está vazia.");
		        } else {
		            System.out.println("Livros na pilha: " + pilhaLivros);
		        }
		    }

		    private static void retirarLivro() {
		        if (pilhaLivros.isEmpty()) {
		            System.out.println("A pilha está vazia. Não é possível retirar um livro.");
		        } else {
		            String livroRetirado = pilhaLivros.pop();
		            System.out.println("Livro \"" + livroRetirado + "\" retirado da pilha.");
		        }
		    }
	


	}


