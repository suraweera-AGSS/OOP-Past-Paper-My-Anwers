package Q4;

public class test {

	public static void main(String[] args) {
		
		MissileController controller = MissileController.getInstance();
		
		MissileSystem heat = HeatMissileSystem.getInstance();
		MIssileOperation heatblast = new BlastMissile(heat);
		MIssileOperation heatlaunch = new LaunchMissile(heat);
		
		System.out.println("initialize heat missile System");
		controller.setBlast(heatblast);
		controller.setLaunch(heatlaunch);
		
		controller.performBlasting("Pakistan");
		controller.performLaunching("India");

		MissileSystem rocket = RocketMissileSystem.getInstance();
		MIssileOperation rocketblast = new BlastMissile(rocket);
		MIssileOperation rocketlaunch = new LaunchMissile(rocket);
		
		System.out.println("initialize rocket missile System");

		controller.setBlast(rocketblast);
		controller.setLaunch(rocketlaunch);
		
		controller.performBlasting("Russia");
		controller.performLaunching("USA");
		
	}

}
