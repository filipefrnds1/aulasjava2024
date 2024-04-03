package poo;

public class Rectangle {

	public double width; // largura
	public double height; // altura
	
	public double area() {
		return this.height*this.width;
	}
	
	public double perimeter() {
		return 2*(this.height+this.width);
	}
	
	public double diagonal() {
		return Math.sqrt((this.height*this.height)+(this.width*this.width));
	}
	

}
