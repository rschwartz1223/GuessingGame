/**
 * Robert Schwartz
 * @exception BadGuessException Exception for invalid guesses
 */

public class BadGuessException extends Exception
{
  //arbitrary static final field
  public static final long serialVersionUID = 42L;
  
  /**
   * no-arg constructor
   */
  public BadGuessException()
  {
    super("Sorry, that was an invalid guess!");
  }
  
  /**
   * parametrized constructor
   * @param message String message passed to super class's constructor
   */
  public BadGuessException(String message)
  {
    super(message);
  }
  
  /**
   * getMessage method to return error message for exception
   */
  @Override
  public String getMessage()
  {
    return "Sorry, that was an invalid guess!\n" + 
           "Please enter a number between 1 and 10.";
  }
}
