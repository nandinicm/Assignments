class Q5
{
	public static void main(String args[])
	{
		String myString = args[0];
		int length = myString.length();
		System.out.println("The length of string is "+length);
		String upperCase = myString.toUpperCase();
		System.out.println(upperCase);
		for (int i = 0; i < (length/2); ++i) 
		{
			if (upperCase.charAt(i) != upperCase.charAt(length - i - 1)) 
			{
				System.out.println("String is not palindrome");
				return;
			}
		}
		System.out.println("String is palindrome");
	}
}