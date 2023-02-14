public class Dados {
	private int numero;
	private int digito;
	private String nome;
	private String cpf;
	private double saldo;

	public Dados(int numero, int digito, String nome, String cpf) {
		this.numero = numero;
		this.digito = digito;
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = 0;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		if(valor < 0) {
			System.out.println("Digite um valor válido");
		} else {
		saldo += valor;
		System.out.println("Depósito realizado com sucesso!");
	}	
	}

	void informacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Conta: " + numero + "-" + digito);
		System.out.println("CPF: " + cpf + "\n");
	}

	public boolean sacar(double valor) {
		if (saldo < valor) {
			System.out.printf("Você não pode sacar um valor maior que seu saldo (R$ %.2f)%n", saldo);
		} else if(valor<0) {
			System.out.println("Digite um valor válido");
		} else {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
		}
		return false;
	}
}