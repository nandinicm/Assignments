import java.util.Random;

/**
 * Created by nandinicm on 12/12/16.
 */
abstract class Compartment{
    abstract void notice();
}

class FirstClass extends Compartment{
    void notice() {System.out.println("This is First class compartment");}
}

class Ladies extends Compartment{
    void notice() {System.out.println("This is Ladies compartment");}
}

class General extends Compartment{
    void notice() {System.out.println("THis is General compartment");}
}

class Luggage extends Compartment{
    void notice() {System.out.println("This is Luggage compartment");}
}

public class TestCompartment {
public static void main(String args[]){
    Compartment[] obj=new Compartment[10];
    Random rand = new Random();
    for(int i=0;i<10;i++)
    {
        int  n = rand.nextInt(4) + 1;
        if(n==1) obj[i]=new FirstClass();
        else if(n==2) obj[i]=new Ladies();
        else if(n==3) obj[i]=new General();
        else if(n==4) obj[i]=new Luggage();
        obj[i].notice();
    }
}
}