import java.util.Scanner; 
class Que1
{
   public static void main(String args[])
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number greater than 0: ");
      int n = scan.nextInt();
      if ((n%2)!=0)
      n--;
      System.out.println("Even numbers <=n are:");
      while(n>0)
      {
        System.out.println(n);
        n=n-2;
      }
   }
}
