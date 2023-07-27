package armstrongNumber;

public class Armstrong {
	static int Digits(int n)
	{
		int count=0;
		while(n!=0)
		{
			int lastdigit=n%10;
			count++;
			n=n/10;
		}
		return count;
	}
}

	
	



