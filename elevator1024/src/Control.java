
public class Control {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		building bldg = new building(10);
		
		//bldg.floors.get(5).fpanel.ecallBtn.press();
		//bldg.elevator.elevpanel.ePanel.get(3).fBtnPress();
		//bldg.floors.get(7).fpanel.ecallBtn.press();
		//bldg.elevator.elevpanel.ePanel.get(9).fBtnPress();
		
		ElevCallButton ev5 =	new ElevCallButton(5);
		new Thread(ev5).start();
				
		ElevCallButton ev3 =	new ElevCallButton(3);
		new Thread(ev3).start();
		
		ElevCallButton ev7 =	new ElevCallButton(7);
		new Thread(ev7).start();
		
		ElevCallButton ev9 =	new ElevCallButton(9);
		new Thread(ev9).start();
		
		
	}

}
