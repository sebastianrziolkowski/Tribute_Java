import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

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

    public void GetArray(int[] x)
    {
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }
    }

    public String[] Set_String_Tab(int x)
    {
        String[] napis = new String[x];
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<x;i++)
        {
            napis[i] = scanner.next();
        }
        return napis;
    }


    public String[] Clear_String_Tab(String[] napis)
    {
        for(int i=0;i<napis.length;i++)
            napis[i]=null;

        return napis;
    }

    public void Get_String_Tab(String[] napis)
    {

        for(int i=0;i<napis.length;i++)
            System.out.print(napis[i] + " ");
        System.out.println();
    }


    public String[][] Set_String_Multi_Array(int x, int y)
    {
        String[][] napisy = new String[x][y];
        RandomString random_string = new RandomString();
        for(int i=0;i<napisy.length;i++)
        {
            for(int j=0;j<napisy[i].length;j++)
            {
                napisy[i][j]= Long.toHexString(Double.doubleToLongBits(Math.random()));
            }
        }

        return napisy;
    }

    public void Get_String_Multi_Array(String[][] napisy)
    {
        for(int i=0;i<napisy.length;i++)
        {
            for(int j=0;j<napisy[i].length;j++)
            {
                System.out.print(napisy[i][j] + " ");
            }
            System.out.println();
        }
    }


}
