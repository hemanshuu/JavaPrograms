class Box
{
	double width;
	double height;
	double depth;
	
	void setDim()
	{
		width = 5 ;
		height = 69;
		depth = 70;
	}
	double volume()
	{
		return(width*height*depth);
	}
	class BoxDemo
	{
		public static void main(String[] args)
		{
			Box b = new Box();
			b.setDim();
			System.out.print("Volume is:"+b.volume);
		}
	}
	
}