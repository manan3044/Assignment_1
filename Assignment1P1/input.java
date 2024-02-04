package Assignment1P1;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class input {
    Scanner sc = new Scanner(System.in);
    public int inputChoice()
    {
        return sc.nextInt();
    }


    public int scannerInput()
    {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }


    public int bufferedReaderInput()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a number: ");
            String inpStr = reader.readLine();
            return Integer.parseInt(inpStr);
        }

        catch (IOException e)
        {
            return 0;
        }
    }


    public int dataInputStream()
    {
        DataInputStream dis = new DataInputStream(System.in);

        try
        {
            System.out.print("Enter a number: ");
            String inpStr = dis.readLine();
            return Integer.parseInt(inpStr);

        } catch (IOException e)
        {
            System.out.println("123");
            return  0;
        }
    }

}
