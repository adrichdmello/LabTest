
public class ElevatorDoor implements Door  {

	boolean eDoorState = false;
	
	public boolean toggleOpenDoor()
	{
		if(this.eDoorState)
		{
			closeElevatorDoor();
		}
		else
		{
			openElevatorDoor();
		}
		
		return eDoorState;
	}

	/**
	 * 
	 */
	public void openElevatorDoor() {
		this.eDoorState = true;
		System.out.println("Elevator door opened");
	}

	/**
	 * 
	 */
	public void closeElevatorDoor() {
		this.eDoorState = false;
		System.out.println("Elevator door closed");
	}
	
	public boolean getDoorState()
	{
		return eDoorState;
	}
	
	
	
	
}
