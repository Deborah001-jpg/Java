package aula06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ativ1Queue {

	
	// Queue estática para armazenar os clientes na fila

	static Queue<String> filaClientes = new LinkedList<>();

	// Scanner estático para entrada do teclado

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao;

		do {
			// Exibir o menu
			
			System.out.println("\n--- Menu ---");
			System.out.println("1: Adicionar Cliente na fila");
			System.out.println("2: Listar Clientes na fila");
			System.out.println("3: Chamar (retirar) Cliente da fila");
			System.out.println("0: Sair");

			// Solicitar a opção do usuário
			
			System.out.print("Escolha uma opção: ");
			opcao = leia.nextInt();

			// Executar a opção escolhida
			
			switch (opcao) {
			case 1:
				adicionarCliente();
				break;
			case 2:
				listarClientes();
				break;
			case 3:
				chamarCliente();
				break;
			case 0:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 0);
	}

	// Método para adicionar um novo cliente na fila
	
	private static void adicionarCliente() {
		System.out.print("Digite o nome do Cliente: ");
		String nomeCliente = leia.next();
		filaClientes.add(nomeCliente);
		System.out.println("Cliente " + nomeCliente + " adicionado à fila.");
	}

	// Método para listar todos os clientes na fila
	
	private static void listarClientes() {
		if (filaClientes.isEmpty()) {
			System.out.println("A fila está vazia.");
		} else {
			System.out.println("Clientes na fila: " + filaClientes);
		}
	}

	// Método para chamar (retirar) um cliente da fila
	
	private static void chamarCliente() {
		if (filaClientes.isEmpty()) {
			System.out.println("A fila está vazia. Não é possível chamar um cliente.");
		} else {
			String clienteChamado = filaClientes.poll();
			System.out.println("Cliente " + clienteChamado + " chamado e retirado da fila.");
		}

	}

}
