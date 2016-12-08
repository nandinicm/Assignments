public class Rectangle
{
    double Length;
    double Breadth;

    Rectangle()
    {
        this.Length  = 0;
        this.Breadth = 0;
    }

    Rectangle(double Length, double Breadth)
    {
        this.Length = Length;
        this.Breadth = Breadth;
    }

     double getArea()
    {
        return (Length * Breadth);
    }

     double getLength()
    {
        return Length;
    }
     
      double getBreadth()
    {
        return Breadth;
    }
}

