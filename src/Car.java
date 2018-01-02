public class Car extends Machine {

    public Car()
    {

    }

    public void wipeWindShield()
    {
        System.out.println("Wiping windshield.");
    }

    @Override
    public void start()
    {
        System.out.println("Car started.");
    }

}
