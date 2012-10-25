import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AlarmTest {
	Alarm testAlarm;
	@Before
	public void setUp() throws Exception {
		testAlarm = new Alarm();
	}

	@Test
	public void testIsAlarmState() {
		//fail("Not yet implemented");
			assertEquals(false,testAlarm.isAlarmState());
		
	}

}
