import java.util.*;   

class box extends Rectangle
	{
		private double height ;

		box()
		{
			super();
			this.height=height;
		}		

		box(double length ,double width ,double height)
		{
			super (length,width );
			this.height=height;
		}

		public void  setdimension(double l,double w,double h)

		{
			super.setdimension(l,w);
			height=h; 
		}
		public double area ()
		{
			return 2*(getlength()*getwidth()+getlength()*height+getwidth()*height);
		}

		public double volume()
		{
			return super.area()*height;
		}
	
		public double getheight()
		{
			return height;
		}

		public void print ()
		{
			System.out.print("\n Box :Area ="+area()+"\n volume: "+volume());
		}

	}
