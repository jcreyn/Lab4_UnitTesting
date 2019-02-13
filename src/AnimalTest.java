import org.junit.Test;

/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     * 
     */
	@Test
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }
	
    
    // TODO: test full constructor, getters, and toString
	@Test
    public void fullConstructorTest() throws AssertException
    {
    	Animal animal = new Animal();
    	String expected = "Chester, a Green-colored animal. 350.0 pounds, 40.0 inches.";
    	String actual = animal.toString();
    	
    	Assert.assertEquals(expected, actual);
    	
    }
}

