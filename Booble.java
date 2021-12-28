class Booble
{
	public static void main(String[]ar)
	{
		int x[]={115,10,230,90,55};
		int i,j,t,k;
		
		for(i=3;i>=0;i--)
		{
			for(j=0;j<=i;j++)
			{
				if(x[j] > x[j+1])
				{
					t= x[j];
					x[j]=x[j+1];
					x[j+1]=t;
				}
				for(k=0;k<=4;k++)
				{
					System.out.print(x[k]+" ");
				}
				System.out.println();
			}
		
			System.out.println("\n");
		}
	}
}
class Demo
{
	public static void main(String[]ar)
	{
		int x[]={115,10,230,90,55};
		int i;
		int max = x[0];
		
		for(i=1;i<5;i++)
		{
			if(x[i]>max)
			{
				max = x[i];
			}
		}
		System.out.println("Max = "+max);
	}
}
*/