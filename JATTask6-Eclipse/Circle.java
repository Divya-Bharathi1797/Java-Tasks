package JATTask6;

public class Circle {
	
	double radius;
	String color;
	
	public Circle(double radius, String color) {
		this.radius=radius;
		this.color=color;
		System.out.println("Parameterized Contructor with two Arguements");
	}	
	public Circle() {
		radius=3;
		color= "Blue";
		System.out.println("Default Contructor with no Arguement");
	}
	public double getCircumference() {
	return  2*Math.PI*radius;

	}	
	public String toString() {
		return "Circle[radius = "+ radius +" , color = "+ color +"]";
	}		
	public static void main(String[] args) {
		
		Circle obj1=new Circle();
		Circle obj2=new Circle(2, "Green");
	      System.out.println(obj1);
	      System.out.println(obj2);
	      System.out.println("Circumference of Circle -Parameterized Contructor " + obj1.getCircumference());
	      System.out.println("Circumference of Circle -Default Contructor " + obj2.getCircumference());
		
	}

}
