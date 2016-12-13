/**
 * Created by nandinicm on 12/12/16.
 */
class Car{
    int speed, noOfGear;
    void drive(){
        speed=250;
        noOfGear=5;
    }
    void display(){
        System.out.println("Starting speed of a Car is:"+speed);
        System.out.println("No of gear in the car is:"+noOfGear);
    }
}

class SportCar extends Car
{
    int initial_speed,gearstatus;
    public void airBallonType()
    {
        initial_speed=120;
        gearstatus=1;
    }
    void display()
    {
        super.display();
        System.out.println("Starting speed of a sports Car is:"+initial_speed);
        System.out.println("no of gear in the sports car is:"+gearstatus);
    }
}
class Q5{
    public static void main(String args[])
    {
        SportCar sc=new SportCar();
        sc.drive();
        sc.airBallonType();
        sc.display();
    }
}