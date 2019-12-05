package naresh;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class jenkinsTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public jenkinsTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( jenkinsTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testjenkins()
    {
        assertTrue( true );
    }
}
