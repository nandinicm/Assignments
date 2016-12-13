public class Rectangle
{
    private double Length=1;
    private double Breadth=1;
	
    public double getArea()
    {
        return (Length * Breadth);
    }
 
    public double getPerimeter()
    {
        return 2*(Length * Breadth);
    }
	
    public void setLength(double Length)
    {
	  if(Length <= 0.0 || Length >= 20.0)
          {
             throw new IllegalArgumentException("Length must be between 0.0 and 20.0");
          }
		this.Length = Length;
    }
	
     public void setBreadth(double Breadth)
     {
	  if(Breadth <= 0.0 || Breadth >= 20.0)	
          {
             throw new IllegalArgumentException("Breadth must be between 0.0 and 20.0");
          }
		this.Breadth = Breadth;
     }
	
    public double getLength()
    {
        return Length;
    }
     
    public double getBreadth()
    {
        return Breadth;
    }
	
    public void display()
    {
		System.out.println("Length of rectangle is "+ getLength());
		System.out.println("Breadth of rectangle is "+ getBreadth());
		System.out.println("Area of rectangle is "+ getArea());
		System.out.println("Perimeter of rectangle is "+ getPerimeter());
    }
}
