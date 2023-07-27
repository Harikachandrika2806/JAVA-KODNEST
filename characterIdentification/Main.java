package characterIdentification;
import java.util.Scanner;
public class Main

{

public static void identifyCharacter(char ch)
{
	if(Character.isDigit(ch))//if(character.isDigit(ch))==true)
	{
		System.out.println("Entered character "+ch+" Is Digit....");
	}
	else if(!Character.isLetter(ch))//if(character.isletter(ch))==false
	{
		System.out.println("Entered character "+ch+" Is special character");
	}
	else
	{
		switch(Character.toLowerCase(ch))
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			if(Character.isLowerCase(ch))
			{
				System.out.println("Entered character "+ch+" Is lower case vowel");
			}
			else
			{
				System.out.println("Entered character "+ch+" Is upper case vowel");
			}
			break;
			default:
				if(Character.isLowerCase(ch))
				{
					System.out.println("Entered character "+ch+" Is lower case consonant");
				}
				else
				{
					System.out.println("Entered character "+ch+" Is upper case consonant");
				}
		}
	
	}
}

public static void main(String[] args)

{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter character");
	char ch=scan.next().charAt(0);
	identifyCharacter(ch);
	scan.close();
	

}

}