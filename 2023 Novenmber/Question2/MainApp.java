package Question2;

public class MainApp {
	
	public static void main(String args[])
	{
		Pair<String,Integer> l1 = new Pair<String, Integer>("test 1", 35);
		Pair<Double,String> l2 = new Pair<Double, String>(23.65, "test 2");
		
		System.out.println("1st pair");
		l1.getFirst();
		l1.getSecond();
		
		System.out.println("");
		
		System.out.println("2nd pair");
		l2.getFirst();
		l2.getSecond();
	}
	

}
