import java.util.ArrayList;
import java.util.Scanner;

public class arrayList
	{

		public static void main(String[] args)
			{
				instantiateArrayList();
			}
		public static void instantiateArrayList()
		{
			ArrayList<Double> numbers = new ArrayList<Double>();
			numbers.add(1.3);
			numbers.add(6.2);
			numbers.add(7.65);
			numbers.add(9.14);
			numbers.add(10.85);
			for (int i=0; i<numbers.size(); i++)
				{
					System.out.println(numbers.get(i));
				}
			System.out.println();
			System.out.println("There are " + numbers.size() + " numbers in the Array List.");
			System.out.println();
			double sum=0;
			for (int i=0; i<numbers.size(); i++)
				{
//					System.out.println(numbers.get(i));
					sum=sum+numbers.get(i);
				}
			System.out.println("The sum is " + sum);
			System.out.println();
			System.out.println(numbers.remove(0));
			numbers.add(8.23);
			numbers.add(3.96);
			double sum2=0;
			for (int i=0; i<numbers.size(); i++)
				{
//					System.out.println(numbers.get(i));
					sum2=sum2+numbers.get(i);
				}
			System.out.println("The sum is " + sum2);
			System.out.println();
			System.out.println("The average is " + sum2/numbers.size());
		}
	}
