package poo;

public class ContaBancaria {
	
	public static int tax = 5;
	
	private int numConta;
	private String nome;
	private double contaSaldo;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(int numConta, String nome, double contaSaldo) {
		super();
		this.numConta = numConta;
		this.nome = nome;
		deposito(contaSaldo);
	}
	
	public ContaBancaria(int numConta, String nome) {
		super();
		this.numConta = numConta;
		this.nome = nome;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getContaSaldo() {
		return contaSaldo;
	}

	public void deposito(double contaSaldo) {
		 this.contaSaldo += contaSaldo;
	}
	
	public void saque(double contaSaldo) {
		
		this.contaSaldo -= contaSaldo;
		this.contaSaldo -= tax;
	}
	
	
	public String toString() {
		return "Account "
				+ numConta
				+ ", Holder: "
				+ nome
				+ ", Balance: $ "
				+ String.format("%.2f", contaSaldo);
	}
	
	
	
	
	
	

}
