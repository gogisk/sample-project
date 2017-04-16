package home.gsk.samples;

import java.util.Scanner;

/**
 * Created by gsk
 * on 4/14/2017.
 */
public class PrintTrianglePattern
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter required number of rows: ");
        int num = reader.nextInt();
        printPattern(num);
    }

    public static void printPattern(int numRows)
    {
        for(int i=0; i<numRows; i++)
        {
            int j=i;
            if(i<=j)
            {
                System.out.print("*");
                j++;
            }
            System.out.println("\n");
        }
    }
}
