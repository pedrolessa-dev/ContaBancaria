import java.util.Scanner;

public class Interface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		Dados dados = new Dados(123456, 7, "Pedro Lessa", "123.456.789-00");
		dados.informacoes();
		do {
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Consultar saldo");
			System.out.println("2 - Depositar valor");
			System.out.println("3 - Sacar valor");
			System.out.println("0 - Sair do banco");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.printf("Saldo = R$ %.2f%n", dados.getSaldo());
				break;
			case 2:
				System.out.println("Quanto deseja depositar?");
				double valor = sc.nextDouble();
				dados.depositar(valor);
				break;
			case 3:
				System.out.println("Quanto deseja sacar?");
				double retirar = sc.nextDouble();
				dados.sacar(retirar);
				break;
			case 0:
				System.out.println("Obrigado pela preferência! Saindo do banco...");
				System.exit(0);
			default:
				System.out.println("Opção inválida");
				continue;
			}
		} while (opcao != 0);
		sc.close();
	}
}