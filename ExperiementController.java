import java.util.*;
/**
 * Experiement Controller evaluates the runtime of the RandomIntegersContainer Class
 * based upon parameters that have been randomly created.
 * 
 * Christian Hollar
 * 8/30/2020
 * hollarc@lafayette.edu
 * CS150
 */
public class ExperiementController
{
    // instance variables - replace the example below with your own
    public int seed;

    /**
     * Constructor for objects of class ExperiementController
     */
    public ExperiementController()
    {
        // initialise instance variables
    }

    public long timeAddToFront(int numberOfItems, int seed)
    {
        // start and stop time are used to calculate the run time
        /* The for loop is used to generate a new random number
         * for each of the "numberOfItems" that are generated. 
         */
        long startTime = System.currentTimeMillis();
        RandomIntegersContainer r = new RandomIntegersContainer();
        for(int i =0; i<= numberOfItems; i++){           
            Random rand = new Random(seed);
            int adder = rand.nextInt();
            r.addToFront(adder);
            }
            long stopTime = System.currentTimeMillis();
        return stopTime-startTime;
        
    }
    
    public long timeAddtoBack(int numberOfItems, int seed){
        // start and stop time are used to calculate the run time
        /*
         * This is a very similiar code to the one previously used for 
         * AddToFront. Again, For loop is used to add the randomly generated
         * number for each of the desired objects. 
         */
        long startTime = System.currentTimeMillis();
        RandomIntegersContainer r = new RandomIntegersContainer();
        for(int i =0; i<= numberOfItems; i++){           
            Random rand = new Random(seed);
            int adder = rand.nextInt();
            r.addToBack(adder);
            }
        long stopTime = System.currentTimeMillis();
        return stopTime-startTime;
    }
    public long timeAddAt(int numberOfItems, int seed){
        // start and stop time are used to calculate the run time
        /*
         * The first for loop is used to generate 20 random numbers to the 
         * front of the new RandomIntegersContainer named r.
         */
        long startTime = System.currentTimeMillis();
        RandomIntegersContainer r = new RandomIntegersContainer();
        for(int i =0; i<= 20; i++){           
            Random rand = new Random(seed);
            int adder = rand.nextInt();
            r.addToFront(adder);
            }
            /*
             * The second for loop is to utilize the addAt method for each of
             * the desired items to add. The first random number generated is
             * create a value to add. The second random number generated is
             * the location of where the previous value will be stored in the 
             * array. The if statement is used to make sure the addWhere value 
             * is positive or else it could generate a negative location within
             * the array.
             */
        for(int i = 0; i<=numberOfItems; i++){           
            Random rand1 = new Random(10000);
            Random rand2 = new Random(10000);
            int addThis = rand1.nextInt();
            int addWhere = rand2.nextInt();
            if(addWhere<0){
                addWhere=addWhere*-1;
            }
            r.addAt(addThis,addWhere);
        }
        long stopTime = System.currentTimeMillis();
        return stopTime-startTime;
    }
}
