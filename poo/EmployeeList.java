package poo;

public class EmployeeList {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public EmployeeList() {
		
	}
	
	
	public EmployeeList(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void percent(Double percet) {
		this.salary += (percet/100)*salary;
	}
	
	@Override
	public String toString() {
		return id
				+ ", "
				+ name
				+ ", "
				+ String.format("%.2f%n", salary);
	}

}
