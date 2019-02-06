class RectangleBoxInheritanceDemo
{
	public static void main(String[] args)
	{
		Rectangle r= new Rectangle();
		r.print();
		r.setdimension(4,4);
		r.print();
		box b=new box();
		b.print();
		b.setdimension(3,4,5);
		b.print();
	}
}