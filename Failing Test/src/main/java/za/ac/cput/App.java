package za.ac.cput;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner scan = new Scanner(System.in);
    public static void main( String[] args )
    {
        MyName myName = new MyName();

        System.out.print("Please enter name: ");
        String name = scan.next();

        System.out.println( "My name is "+ myName.nameIs(name) );
    }
}
