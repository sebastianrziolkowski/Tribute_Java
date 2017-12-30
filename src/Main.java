import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String args[])
    {

        /*
        int ArraySize=6;
        array Tab_Fun = new array();
        array String_Fun = new array();
        RandomString random_string = new RandomString();

        int[] tab = Tab_Fun.SetArray(ArraySize);
        Tab_Fun.GetArray(tab);

        String[] napis = String_Fun.Set_String_Tab(ArraySize);
        String_Fun.Get_String_Tab(napis);
        String_Fun.Clear_String_Tab(napis);
        String_Fun.Get_String_Tab(napis);
        */

        /*
        array Random_String = new array();

        String[][] napis = Random_String.Set_String_Multi_Array(3,4);
        Random_String.Get_String_Multi_Array(napis);
        */

        //              --Object class person

        /*
        Person person1 = new Person();
        person1.age=15;
        person1.name="Tom";
        person1.Show_Person();
*/

        /*
        Robot sam = new Robot();
        sam.speak("Hello I'm Sam");
        sam.move("Weast", 12.2);
        */

        /*
        Animal frog = new Animal();
        frog.setName("Tom");
        frog.setAge(2);
        */

        /*
        Thing.description = "I am t static thing";

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        Thing thing3 = new Thing();

        thing1.showInfo();
        thing2.showInfo();
        thing3.showInfo();
        */

        /*
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Bob.").append(" ").append("I am a lion tamer.");
        System.out.print(sb.toString());

        System.out.printf("\nTotal cost %d: quantity is %d.\n", 5, 120);
        */

        /*
        Ftring ftring = new Ftring(7,"Bob");
        System.out.println(ftring.toString());
        */


        Machine machine = new Machine();
        machine.start();
        machine.stop();

        Car car = new Car();

        car.start();

        car.wipeWindShield();

        car.stop();
    }


}
