public class ZooTest {
	
	/**
	 * Test the default constructor Zoo which has args intialCapacity.
	 * @throws AssertException
	 */
    public void zooTest() throws AssertException
    {
    Zoo zoo = new Zoo(0);
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
        Zoo newZoo = new Zoo(5);
        newZoo.expandZoo();
        Assert.assertEquals(10, newZoo.getCapacity());
        
        
        Assert.assertEquals(new Animal[10], newZoo.getAnimals());
        
    }
    
    /**
     * 
     * @throws AssertException
     */
    public void addAnimalsTest() throws AssertException
    {
        Zoo newZoo = new Zoo(4);
        Animal animal1 = new Animal("Green", "Chester", 350.0, 40);
        Animal animal2 = new Animal("Blue", "Chad", 35.0, 4);
        newZoo.addAnimal(animal1);
        newZoo.addAnimal(animal2);
        //Assert.assertEquals(new Animal[]{animal1, animal2, new Animal(), new Animal()});
        Assert.assertEquals(new Animal[]{animal1, animal2}, newZoo.getAnimals());
        
        
    }
}

