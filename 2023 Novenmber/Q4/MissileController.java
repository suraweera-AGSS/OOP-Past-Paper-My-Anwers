package Q4;

public class MissileController {
	
	private static volatile MissileController instance;
	
	MIssileOperation launch;
	MIssileOperation blast;
	
	private MissileController() {}

	public static MissileController getInstance()
	{
		if(instance == null)
		{
			synchronized (MissileController.class)
			{
				if(instance == null)
				{
					instance = new MissileController();
				}
				
			}
		}
		return instance;

	}
	
	public void setLaunch(MIssileOperation launch)
	{
		this.launch = launch;
	}
	
	public void setBlast(MIssileOperation blast)
	{
		this.blast = blast;
	}
	
	public void performLaunching(String start)
	{
		launch.initiateOperation(start);
	}
	
	public void performBlasting(String end)
	{
		blast.initiateOperation(end);
	}
}
