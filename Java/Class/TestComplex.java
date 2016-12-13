class Complex
{
int Real,Imag;
public Complex()
{
	Real=5;
	Imag=5;
}
public Complex(int Real1,int Imag1)
{
Real=Real1;
Imag=Imag1;
}
public Complex Add(Complex C1,Complex C2)
{
Complex CSum=new Complex();
CSum.Real=C1.Real+C2.Real;
CSum.Imag=C1.Imag+C2.Imag;
return CSum;
}
public Complex Sub(Complex C1,Complex C2)
{
Complex CSub=new Complex();
CSub.Real=C1.Real-C2.Real;
CSub.Imag=C1.Imag-C2.Imag;
return CSub;
}
public void display(){
	Complex C1=new Complex(4,-8);
	Complex C2=new Complex(-5,7);
	Complex C3=new Complex();
	C3=C3.Add(C1,C2);
	if(C3.Imag<0)
	System.out.println("Sum: " + C3.Real + C3.Imag +"i");
	else if(C3.Imag==0)
	System.out.println("Sum: " + C3.Real);
	else if(C3.Imag>0)
	System.out.println("Sum: " + C3.Real + "+" + C3.Imag +"i");
	C3=C3.Sub(C1,C2);
	if(C3.Imag<0)
	System.out.println("Difference: " + C3.Real + C3.Imag +"i");
	else if(C3.Imag==0)
	System.out.println("Difference: " + C3.Real);
	else if(C3.Imag>0)
	System.out.println("Difference: " + C3.Real + "+" + C3.Imag +"i");
}
}
 
class TestComplex
{
public static void main(String[] a)
{
Complex C3=new Complex();
C3.display();
}
}