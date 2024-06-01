package Question2;

public class Pair<T, U> {

	T ob1;
	U ob2;
	
	public Pair(T ob1, U ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	
	public void getFirst()
	{
		System.out.println("First Value: "+ob1);
	}
	
	public void getSecond()
	{
		System.out.println("Second Value: "+ob2);
	}
}
