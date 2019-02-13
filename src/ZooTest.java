

public class ZooTest {
	
	/**
	 * Test the default constructor Zoo which has args intialCapacity.
	 * @throws AssertException
	 */

    public void zooTest() throws AssertException
    {
    Zoo zoo = new Zoo(0);
   // Animal a = new Animal("Green", "Chester", 350.0, 40);
    Assert.assertEquals(0, zoo.getCapacity());
    Assert.assertEquals(0, zoo.getAnimals());
    Assert.assertEquals(new Animal[0], zoo.getAnimals());
    }
    
    /**
     * 
     * @throws AssertException
     */

    public void expandZooTest() throws AssertException
    {
        Zoo zoo = new Zoo(4);
        zoo.expandZoo();
        
        Assert.assertEquals(8, zoo.getCapacity());
        
        
        Assert.assertEquals(new Animal[4], zoo.getAnimals());
        
    }
    
    /**
     * 
     * @throws AssertException
     */
	
    public void addAnimalTest() throws AssertException
    {
        Zoo zoo = new Zoo(1);
        Animal animal1 = new Animal("Green", "Chester", 350.0, 40);
        Animal animal2 = new Animal("Blue", "Chad", 35.0, 40);
        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        Assert.assertEquals(new Animal[]{animal1, animal2, new Animal(), new Animal()}, zoo.getAnimals());
       // Assert.assertEquals(new Animal[]{animal1, animal2}, newZoo.getAnimals());
        //Assert.assertEquals(animal1, zoo.getAnimals());
      
    }
    
    public void toStringTest() throws AssertException
    {
    	Zoo zoo = new Zoo(2);
        Animal animal1 = new Animal("Green", "Chester", 350.0, 40);
        Animal animal2 = new Animal("Blue", "Chad", 35.0, 40);
        zoo.addAnimal(animal1);
       // zoo.addAnimal(animal2);
        Assert.assertEquals("These animals live in the zoo: \n"
        		+ new Animal(), zoo.toString());
 
    }
}

