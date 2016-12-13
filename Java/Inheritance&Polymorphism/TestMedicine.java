import java.util.Random;

/**
 * Created by nandinicm on 12/12/16.
 */
class Medicine{
    private String Name = "Accure Labs Pvt. Ltd.";
    private String Address = "S-1, Greater Kailash-1, New Delhi";
    void displayLabel(){
        System.out.println("Name: "+Name+"\n"+"Address: "+Address);
    }
}

class Tablet extends Medicine{
    void displayLabel(){
        super.displayLabel();
        System.out.println("store in a cool dry place");
    }
}

class Syrup extends Medicine{
    void displayLabel(){
        super.displayLabel();
        System.out.println("measure for proper quantity");
    }
}
class Ointment extends Medicine{
    void displayLabel(){
        super.displayLabel();
        System.out.println("for external use only");
    }
}

public class TestMedicine {
public static void main(String args[]){
        Medicine[] med=new Medicine[10];
        Random rand = new Random();
        for(int i=0;i<10;i++)
        {
            int  n = rand.nextInt(3) + 1;
            if(n==1) med[i]=new Tablet();
            else if(n==2) med[i]=new Syrup();
            else if(n==3) med[i]=new Ointment();
            med[i].displayLabel();
        }
    }
}