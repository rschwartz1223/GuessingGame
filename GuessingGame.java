/**
 * Robert Schwartz -- Guessing Game
 */

import java.util.Random;
import java.util.*;

public class GuessingGame
{
  public static void main(String[] args)
  {
    // Scanner object to receive user input
    Scanner keyboard = new Scanner(System.in);
    
    // create Random class object & random variable
    Random rng = new Random();
    int n = rng.nextInt(10 - 1 + 1) + 1;
      
    // initialize incrementor for guessing turns
    int turn = 1;
    
    // initialize variable for user input (guess)
    int guess = 0;
   
    // try-catch block
    try
    {
      do
      {
        // throw TooManyGuessesException for more than five turns
        if(turn > 5)
          throw new TooManyGuessesException();
        
        // prompt user to enter their guess
        System.out.println("Guess a number between 1 and 10 inclusive.");
        System.out.println("Hint: the answer is " + n);
        // receive user input (their guess)
        guess = keyboard.nextInt();
        
        // throw BadGuessException for numbers between 1 and 10
        if(guess == n)
          System.out.println("YOU WIN!\nIt took you " + turn + " attempts.");
        else if(guess < 1 || guess > 10)
          throw new BadGuessException();
        
        // increment turn variable
        turn++;        
      }while(guess != n);
    }
    catch(BadGuessException | TooManyGuessesException e)
    {
      System.out.println(e.getMessage());
    }
    catch(NumberFormatException e)
    {
      System.out.println("Sorry, you entered an invalid number format.");
    }
    
    // close scanner object
    keyboard.close();
  }
}
