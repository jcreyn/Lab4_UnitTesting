

public class EquipmentTest {

	

public void fullConstructorTest() throws AssertException
	{
    Equipment equipment = new Equipment("Chester/4,3.22,22.30,This is description");
    Assert.assertEquals("Chester", equipment.getName());
    Assert.assertEquals(4, equipment.getCount());
    Assert.assertEquals(3.22, equipment.getTotalWeight(), 0.01);
    Assert.assertEquals(22.30, equipment.getTotalPrice(), 0.01);
    Assert.assertEquals("This is description", equipment.getDescription());
	}

public void getColorTest() throws AssertException
	{
    Animal animal = new Animal();
    Assert.assertEquals("unknown", animal.getColor());  
	}

public void toStringTest() throws AssertException
	{
    Equipment equipment = new Equipment("Chester/4,3.22,22.30,This is description");
    Assert.assertEquals("Name: Chester, Number: 4, Weight: 3.22 lbs, Price: $22.30 - This is description", equipment.toString());
	}
}