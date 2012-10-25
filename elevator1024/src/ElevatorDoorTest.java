import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ElevatorDoorTest {
	ElevatorDoor eDoor;
	@Before
	public void setUp() throws Exception {
		eDoor  = new ElevatorDoor();
	}

	@Test
	public void testToggleOpenDoor() {
		//fail("Not yet implemented");
	
		
		if(eDoor.toggleOpenDoor())
		{
			assertEquals(false,eDoor.toggleOpenDoor());
		}
		else
		{
			assertEquals(true,eDoor.toggleOpenDoor());
		}
		
	}
	
	@Test
	public void testGetDoorState()
	{
		ElevatorDoor eDoor = new ElevatorDoor();
		
		assertEquals(false,eDoor.getDoorState());
		
	}

}
