import java.util.*;   


class  Rectangle
	{
		public static void main(String[] args);
		private double length ;
		private double width ;
		
		Rectangle()
		{
			length=0;
			width=0;
		}
		Rectangle (double length ,double width)

		{
			this.length=length;
			this.width=width;
		}

		public void setdimension( double l,double w)
		{
			length=l;
			width=w;
		}
		public double getlength()
		{
			return length;
		}
		public double getwidth()
		{
			return width;
		}
		public double area()
		{
			return length*width;

		} 
		public double perimeter ()
		{
			return 2*(length+width);
		} 
		public void print ()
		{
			System.out.println("Lenght: "+length+"\n"+"Width"+width+"\n Area:"+area()+"\n Perimeter"+perimeter());
		}


}