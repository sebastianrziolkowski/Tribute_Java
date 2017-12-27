import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String args[])
    {
      //  int ArraySize=6;
    //    array Tab_Fun = new array();
  //      array String_Fun = new array();
//        RandomString random_string = new RandomString();

        // int[] tab = Tab_Fun.SetArray(ArraySize);
        // Tab_Fun.GetArray(tab);

        // String[] napis = String_Fun.Set_String_Tab(ArraySize);
        // String_Fun.Get_String_Tab(napis);
        // String_Fun.Clear_String_Tab(napis);
        // String_Fun.Get_String_Tab(napis);

        array Random_String = new array();

        String[][] napis = Random_String.Set_String_Multi_Array(3,4);
        Random_String.Get_String_Multi_Array(napis);


    }


}
