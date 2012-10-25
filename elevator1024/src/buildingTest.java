import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class buildingTest {
	building b;
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testBuilding() {
		//fail("Not yet implemented");
		b = new building(9);
		assertEquals(9, b.totalFloors);
	}

	@Test
	public void testMakeElevator() {
		//fail("Not yet implemented");
	}

}
