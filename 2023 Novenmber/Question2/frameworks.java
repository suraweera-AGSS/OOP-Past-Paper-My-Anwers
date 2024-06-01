package Question2;

import java.util.ArrayList;
import java.util.Scanner;

public class frameworks {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter Integers : ");
		
		int num = 0;
		
		do {
			num = scan.nextInt();
			list.add(num);
		}while(num != 0);
		
		scan.close();
		
		list.removeIf(number-> number % 2 ==0);
		
//		ArrayList<Integer> list2 = new ArrayList<>();
		
		for (Integer list2: list)
		{
			System.out.println(list2);
		}

	}

}
