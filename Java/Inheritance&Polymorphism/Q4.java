/**
 * Created by nandinicm on 12/12/16.
 */
public class Q4 {
public static void main(String args[]){
    if(args.length==0)
    {
        System.out.println("No arguments are passed");
    }
    else
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        char p=args[2].charAt(0);
        if(p=='+')
        System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
        else if(p=='-')
            System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
        else if(p=='*')
            System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
        else if(p=='/')
            System.out.println("Divison of "+a+" and "+b+" is "+(a/b));
        else System.out.println("Enter character belonging to (+,-,*, /) only");
    }
}
}