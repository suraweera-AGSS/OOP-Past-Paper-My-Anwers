package Q4;

public class LaunchMissile implements MIssileOperation{
	
	MissileSystem ms;

	public LaunchMissile(MissileSystem ms) {
		this.ms = ms;
	}

	@Override
	public void initiateOperation(String location) {
System.out.println("Launch missile Initiation"+location);		
	}
	
}
