import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int opcao;
		Cliente cliente = new Cliente();
		

		do {
			System.out.println("\n-- PROJETO DE VENDAS --\n");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Listar clientes");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("\n--Cadastrar cliente --\n");
				System.out.println("Nome cliente: ");
				cliente.setNome(sc.next());
				System.out.println("Nome: " + cliente.getNome());				
				break;
			case 2:
				System.out.println("\n-- Listar clientes--\n");
				break;
			case 0:
				System.out.println("\nSaindo...\n");
			default:
				System.out.println("\n OPÇÃO INVÁLIDA");
				break;
			}
		} while (opcao != 0);

		sc.close();

	}

}
