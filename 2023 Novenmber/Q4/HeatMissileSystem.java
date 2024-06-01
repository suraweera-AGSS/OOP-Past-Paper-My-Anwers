package Q4;

public class HeatMissileSystem implements MissileSystem{


	private static volatile HeatMissileSystem instance; //Step 1
	
	private HeatMissileSystem() {} //Step2
	
	public static HeatMissileSystem getInstance()
	{
		if (instance == null)
		{
			synchronized (RocketMissileSystem.class)
			{
				if (instance == null)
				{
					instance = new HeatMissileSystem();
				}

			}
			
		}
		return instance;
	}
	
	@Override
	public void launch(String source) {
		System.out.println("Launch is working" + source);
		
	}

	@Override
	public void blast(String destination) {
		System.out.println("Blast is working"+ destination);		
	}

}
