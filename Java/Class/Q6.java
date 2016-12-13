class Q6
{
      public static void main(String args[])
      {
	int arr[]={10,5,22,15,30};
	int MAX=40,MIN=1,c=0;
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	System.out.println("Your first number "+a);
	System.out.println("Your second number "+b);
        if(a<MIN || a>MAX || b<MIN || b>MAX)
	{
          System.out.println("Enter the numbers within range 1-40 only");
	  return;
	}
	for(int i=0;i<arr.length;i++)
	{
	  if(arr[i]==a)
	  c++;
	  if(arr[i]==b)
	  c++;
	}
	if (c==2)
	System.out.println("Its Bingo!");
	else 
	System.out.println("Not Found!");
      }
}
