package Lab4;

import java.io.*;
import java.util.*;

public class Lab4_2 {

    public static void main(String[] args)
    {
        File file = new File("numbers.txt");

        try (Scanner scanner = new Scanner(file)) 
        
        {
            scanner.useDelimiter(",");

            System.out.println("Even Numbers:");
            while (scanner.hasNextInt()) 
            {
                int number = scanner.nextInt();
                if (number % 2 == 0) 
                
                {
                    System.out.print(number + " ");
                }
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}



