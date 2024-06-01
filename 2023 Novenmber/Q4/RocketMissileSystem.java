package Q4;

public class RocketMissileSystem implements MissileSystem{
	
	private static volatile RocketMissileSystem instance; //Step 1
	
	private RocketMissileSystem() {} //Step2
	
	public static RocketMissileSystem getInstance()
	{
		if (instance == null)
		{
			synchronized (RocketMissileSystem.class)
			{
				if (instance == null)
				{
					instance = new RocketMissileSystem();
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
