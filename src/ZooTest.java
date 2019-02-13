
public class ZooTest {

	
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
	 
	 // need getCapacity test. 
	 public void getCapacityTest {
		 	Animal animal = new Animal();
		 	
	 }
	 
	 // finish this test
	 public void fullConstructorTest() throws AssertException
	 {
		 	Animal animal = new Animal();
	 }
	 
	 // finish this test
	 public void toStringTest() throws AssertException
	 {
		Animal a = new Animal("Green", "Chester", 350.0, 40);
		String expected = ; // finish
		String actual = a.toString(); 
		Assert.assertEquals(expected, actual); //finish
		 
	 }
}
