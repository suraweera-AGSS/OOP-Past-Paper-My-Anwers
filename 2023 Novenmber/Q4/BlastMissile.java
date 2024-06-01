package Q4;

public class BlastMissile implements MIssileOperation{

	private MissileSystem ms;
	
	public BlastMissile(MissileSystem ms) {
		this.ms = ms;
	}

	@Override
	public void initiateOperation(String location) {
System.out.println("Blast missile Initiation "+location);		
	}
	
}
