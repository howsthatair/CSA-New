import java.util.Random;


public class Feeder
{
/**
* The amount of food, in grams, currently in the bird feeder; initialized in the constructor and
* always greater than or equal to zero
*/
private int currentFood;
/**
* Simulates one day with numBirds birds or possibly a bear at the bird feeder,
* as described in part (a)
* Precondition: numBirds > 0
*/
public void simulateOneDay(int numBirds)
{ /* to be implemented in part (a) */ 
    int foodEaten = numBirds * 20;
    currentFood = currentFood - foodEaten;
    int foodEatenByBird = random.nextInt(50-10+1)+10;
    System.out.println(foodEatenByBird);
    
    }
    
}
/**
* Returns the number of days birds or a bear found food to eat at the feeder in this simulation,
* as described in part (b)
* Preconditions: numBirds > 0, numDays > 0
*/
// public int simulateManyDays(int numBirds, int numDays)
// { /* to be implemented in part (b) */ }
// There may be instance variables, constructors, or methods that are not shown.
}
