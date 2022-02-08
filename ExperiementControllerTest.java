

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExperiementControllerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExperiementControllerTest
{
    private ExperiementController initialtest1;
    private ExperiementController intialtest2;
    private ExperiementController initialtest3;

    /**
     * Default constructor for test class ExperiementControllerTest
     */
    public ExperiementControllerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        initialtest1 = new ExperiementController();
        initialtest1.timeAddAt(10, 10000);
        intialtest2 = new ExperiementController();
        intialtest2.timeAddToFront(10, 10000);
        initialtest3 = new ExperiementController();
        initialtest3.timeAddtoBack(10, 10000);
    }

}


