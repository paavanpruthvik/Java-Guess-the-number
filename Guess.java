import java.util.Random;
import java.util.Scanner;

public class Guess 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean correct = false;
		Random ra = new Random();
		int randno = ra.nextInt(10);
		System.out.println(randno);
			
		while(!correct)
		{
			System.out.print("Guess the number: ");
			int guessedno = sc.nextInt();
			if(guessedno == randno)
				{
					System.out.println(guessedno +" is the right number!");
					correct = true;
				}
				else if(guessedno > randno)
				{
					System.out.println("Actual Number is lower than "+guessedno);
				}
				else if(guessedno < randno)
				{
					System.out.println("Actual Number is higher than "+guessedno);
				}		
		}	
	}	
}