package poo;

public class Employe {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public Employe() {
		
	}
	
	public Employe(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void incrementarSalario(Double percent) {
		salario += (salario*percent)/100;
	}
	
	@Override
	public String toString() {
		return id
				+ ", "
				+ nome
				+ ", "
				+ String.format("%.2f%n", salario);
	}

}
