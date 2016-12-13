import java.util.Scanner;
class TestRectangle
{
   public static void main(String args[])
   {
		Rectangle rect[] = new Rectangle[10];
        Scanner scan = new Scanner(System.in);
     for(int i=0; i<5;i++)
	{
		System.out.println("Enter length and breadth of Rectangle");
		double Length = scan.nextDouble();
		double Breadth = scan.nextDouble();
		rect[i] = new Rectangle();
		rect[i].setLength(Length);
		rect[i].setBreadth(Breadth);
		rect[i].display();
	}
   }
}