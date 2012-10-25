
public class FloorDoor implements Door{

	boolean fDoorState = false;
	
	public boolean toggleOpenDoor()
	{
		if(this.fDoorState)
		{
			floorDoorClose();
		}
		else
		{
			floorDoorOpen();
		}
		
		return fDoorState;
	}

	/**
	 * 
	 */
	public void floorDoorOpen() {
		this.fDoorState = true;
		System.out.println("Floor door opened");
	}

	/**
	 * 
	 */
	public void floorDoorClose() {
		this.fDoorState = false;
		System.out.println("Floor door closed");
	}
	
}
