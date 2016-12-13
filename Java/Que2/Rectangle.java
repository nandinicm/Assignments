public class Rectangle
{
    private double Length;
    private double Breadth;

    public Rectangle()
    {
        Length  = 0;
        Breadth = 0;
    }

    public Rectangle(double Length, double Breadth)
    {
        this.Length = Length;
        this.Breadth = Breadth;
    }

    public double getArea()
    {
        return (Length * Breadth);
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
    }
}
