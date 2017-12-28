import java.util.Calendar;

class Person        //Make object called person
{

    String name;
    int age;

    public void Show_Person() {
        Calendar calendar = Calendar.getInstance();
        int y=calendar.get(Calendar.YEAR);

        System.out.print("Hello my name is " + name + " and I'm " + age + " years old, and I was born in " + (y-age));
        System.out.println();
    }


}

class Robot
{
    public void speak(String speaking)
    {
        System.out.print(speaking);
        System.out.println();
    }

    public void move(String direction, double distance)
    {
        System.out.print("Moving " + direction + " " + distance + " meters");
        System.out.println();
    }
}


class Animal
{
    private String name;
    private int age;

    public Animal()
    {
        name = "None";
        age = 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }
}


class Thing
{
    public String name;
    public static String description;
    public static int counter;
    public int id;

    public Thing()
    {
        id=counter;
        counter++;
        this.name="None";
    }


    public void showInfo()
    {
        System.out.print(name + "  " + description + " my ID is: " + id);
        System.out.println();
    }
}