package divisiblityRules;

public class Divisible {

	public void result(int n) {
	
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		
	}


	  void result1(int n)
	{
		for(int i=0;i<=n;i++)
		{
			if(i%3==0)
			{
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
	}
 void result2(int n)
	{
		for(int i=0;i<=n;i++)
		{
			if(n%5==0)
			{
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
	}
	 void result3(int n)
	{
		for(int i=0;i<=n;i++)
		{
			if(i%2==0 && i%5==0)
			{
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
	}
	 void result4(int n)
	{
		for(int i=0;i<=n;i++)
		{
			if(i%3==0)
			{
				if(i%5==0)
				{
					System.out.print(i+" ");
				}
			}
			
		}
		System.out.println();
	}
	 
	
	  void result6(int n)
	{
		for(int i=0;i<=n;i++)
		{
			if(i%3==0)
			{
				if(i%2==0)
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
	}
	 void result7(int n)
	{
		for(int i=0;i<=n;i++)
		{
			if(i%2!=0)
			{
				if(i%5==0)
				{
					System.out.print(i+" ");
				}
			}
			
		}
		System.out.println();
	}
	  
	
	
}
