import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylistPractice
	{

		public static void main(String[] args)
			{
				instantiateArrayList();
			}
		public static void instantiateArrayList()
		{
			ArrayList <Double> thermometer = new ArrayList <Double>();
			thermometer.add(98.6);
			thermometer.add(99.4);
			thermometer.add(97.98);
			thermometer.add(101.35);
			thermometer.add(100.43);
			thermometer.add(98.12);
			thermometer.add(98.6);
			thermometer.add(99.1);
			thermometer.add(98.3);
			thermometer.add(97.81);
			for (int i=0; i<thermometer.size(); i++)
				{
					System.out.println(thermometer.get(i)+ "° Fahrenheit");
				}
			System.out.println();
			double counter=0;
			for (int c=thermometer.size()-1; c>=0; c--)
				{
					if (thermometer.get(c)>98.6)
						{
							counter=counter+1;
							System.out.println(thermometer.get(c));
						}
				}
			System.out.println();
			System.out.println(counter);
			System.out.println();
			for (int i=0; i<thermometer.size(); i++)
				{
					System.out.println(thermometer.get(i));
					System.out.println((thermometer.get(i)-32)/1.8 + "° Celsius");
					System.out.println();
				}
			System.out.println();
			for (int c=thermometer.size()-1; c>=0; c--)
				{
					if (thermometer.get(c)>98.6)
						{
							thermometer.remove(c);
						}
				}
//			for (int i=0; i<thermometer.size(); i++)
//				{
//					System.out.println(thermometer.get(i) + "° Fahrenheit");
//				}
			Collections.sort(thermometer);
			for (int i=0; i<thermometer.size(); i++)
				{
					System.out.println("Temps below 98.6 are " + thermometer.get(i) + "° Fahrenheit");
				}
			System.out.println();
			System.out.println("The lowest healthy temperature is " + thermometer.get(0) + "° F");
			System.out.println("The highest healthy temperature is " + thermometer.get(thermometer.size()-1) + "° F");
			//test
		}

	}
