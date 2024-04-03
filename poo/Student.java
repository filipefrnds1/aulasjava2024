package poo;

public class Student {
	
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double notaFinal() {
		return n1+n2+n3;
	}
	
	public void passOrMissing() {
		if(notaFinal() < 60.00) {
			System.out.println("FAILED");
			System.out.println("MISSING " + (60-notaFinal()) + " POINTS");
		}else {
			System.out.println("PASS");
		}
	}
	
	
	
	

}
