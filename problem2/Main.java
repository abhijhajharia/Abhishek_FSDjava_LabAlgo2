package dsa.labassignment2.problem2;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size of currency denominations");
		int size=sc.nextInt();
		int[] currency=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the currency denomination values "+i);
			currency[i]=sc.nextInt();
		}
		System.out.println("Before "+Arrays.toString(currency));
		Sort s=new Sort();
		s.sort(currency);
		System.out.println("After "+Arrays.toString(currency));
		System.out.println("Enter the amount you want to pay");
		int amount=sc.nextInt();
		NoteCount nc=new NoteCount();
		nc.counting(currency, amount);
		}
	}


