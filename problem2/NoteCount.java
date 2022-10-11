package dsa.labassignment2.problem2;

public class NoteCount {
	public void counting(int[] currency,int amount)
	{
		int noteqty[]=new int[currency.length];
		int i;
		int sum=0;
		for(i=0;i<currency.length;i++)
		{
			noteqty[i]=amount/currency[i];
			sum=sum+noteqty[i];
			amount=amount%currency[i];
		}
		for(i=0;i<currency.length;i++)
		{
			if(noteqty[i]!=0)
				System.out.println(currency[i]+ "X" + noteqty[i]);
		}
		System.out.println("Total number of notes "+sum);
	}
	}

