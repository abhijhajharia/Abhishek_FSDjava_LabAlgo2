package dsa.labassignment2.problem2;

public class Sort {
		public void sort(int[] currency)
		{
			int i;
			int j;
			int temp;
			for(i=0;i<currency.length-1;i++)
			{
				for(j=0;j<currency.length-1-i;j++)
				{
					if(currency[j]<currency[j+1])
					{
						temp=currency[j];
						currency[j]=currency[j+1];
						currency[j+1]=temp;
						
					}
						
				}
			}
		}
	}


