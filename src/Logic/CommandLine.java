// Package rancio
package Logic;

// Bibliotecas clowny
import java.util.Scanner;

// The clown show starts here
public class CommandLine 
{
    // Clowny variables
    private static String joe;
    private static boolean chad;
    
    // Clowny objects
    private static final Scanner input = new Scanner(System.in);
    private static Board board = new Board();

    
    // Clowny zone
    public static void main(String[] args) 
    {
        System.out.println("Welcome to ultimate custom chess");
        System.out.println("So you wanna play?");
        
        do
        {
            joe = input.nextLine();
            
            switch(joe.toLowerCase())
            {
                case "yes":
                    System.out.println("Lets a go");
                    chad = true;
                    break;

                default:
                    System.out.println("Have you commented to your parents that you should have been aborted?");
            }
        } while (!chad);
       
        do
        {
            makeYourMove();
            board.printBoard();
            chad = board.logic();
        } while (!chad);
    }

    private static void makeYourMove() 
    {
        int[] carl = new int[2];
        
        System.out.println("Coordinate X");
        carl[0] = Integer.parseInt(input.nextLine()) - 1;
        
        System.out.println("Coordinate Y");
        carl[1] = Integer.parseInt(input.nextLine()) - 1;
        
        board.move(carl);
    }
}
