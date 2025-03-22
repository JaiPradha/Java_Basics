abstract class Vehicle{
abstract void speed();
}
class Bike extends Vehicle{
    void speed()
    {
        System.out.println("56km/hr");
    }
}
class Car extends Vehicle{
    void speed(){
        System.out.println("50km/hr");
    }
}
public class Abstraction_Example {
    public static void main(String ara[])
    {
        Vehicle v1=new Bike();
        Vehicle v2=new Car();
        v1.speed();
        v2.speed();
    }
}
