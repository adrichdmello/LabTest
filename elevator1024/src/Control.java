
public class Control {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		building bldg = new building(10);
		
		//bldg.floors.get(5).fpanel.ecallBtn.press();
	
		ElevCallButton ev5 =	new ElevCallButton(5);
		new Thread(ev5).start();
		
		//bldg.elevator.elevpanel.ePanel.get(3).fBtnPress();
		ElevCallButton ev3 =	new ElevCallButton(3);
		new Thread(ev3).start();
		
		//bldg.floors.get(7).fpanel.ecallBtn.press();
		ElevCallButton ev7 =	new ElevCallButton(7);
		new Thread(ev7).start();
		
		//bldg.elevator.elevpanel.ePanel.get(9).fBtnPress();
		ElevCallButton ev9 =	new ElevCallButton(9);
		new Thread(ev9).start();
		
		
	}

}
