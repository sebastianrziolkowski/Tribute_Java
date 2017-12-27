import java.util.Scanner;

public class array {

    public int[] SetArray(int x)
    {
        Scanner scanner = new Scanner(System.in);

        int[] tab = new int[x];

        for(int i=0;i<tab.length;i++)
        {
            tab[i] = scanner.nextInt();
        }
        return tab;
    }

    public static void GetArray(int[] x)
    {
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }
    }

}
