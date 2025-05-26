package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int inputNumber=7;
		for(i=2;i<=inputNumber-1;i++)
		{
			if(inputNumber%i == 0)
				break;
		}
		if(inputNumber==i)
			System.out.println(inputNumber+ " is prime number");

		else

			System.out.println(inputNumber+ " is non prime number");

	}

}
