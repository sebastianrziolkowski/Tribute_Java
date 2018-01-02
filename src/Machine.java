public class Machine {
    public String name;
    public final static int ID =8;

    private String type;
    protected String size;



    public Machine()
    {
        this.name="Bob";
        this.type="Turing";
        this.size="Large";
    }



    public void start()
    {
        System.out.println("Machine started.");
    }

    public void stop()
    {
        System.out.println("Machine stoped.");
    }

}
