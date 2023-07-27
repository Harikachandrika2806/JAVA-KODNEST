package armstrongNumber;
import java.math.*;
public class ArmNumber {

	public static int findNumber(int n,int res) {
		int sum=0;
	
		if(n==0)
		{
			return 0;
		}
		while(n!=0)
		{
			int digit=n%10;
			int value=(int) Math.pow(digit,res);
			sum=sum+value;
			n=n/10;
			
		}
		return sum;
	}
}