package poo;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double amountPaid(double dollar, double quantity) {
		double percen = dollar*IOF;
		return (percen+dollar)*quantity;
	}
	

}
