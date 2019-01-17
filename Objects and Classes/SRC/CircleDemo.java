class Circle {
	double radius;

	double findArea()
{
	return radius * radius * 3.14159;

}

void displayArea(){
	System.out.println("Area = " +findArea());
}
}
class CircleDemo {
	public static void main (String[] args)
	{Circle c = new Circle();
		c.radius = 5;
	    c.displayArea();
}
}