package t_09_interfaces.ex16.copy;

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(new AdapterCharsGenerator(10));
        while (s.hasNext())
        {
            System.out.println(s.next());
        }
        s.close();
    }

}
