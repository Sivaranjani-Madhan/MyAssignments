package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber=0;
		int secondNumber=1;
		int inputRange=8;
		for(int i=0;i<inputRange;i++)
		{
			    System.out.println(firstNumber);
				int result=firstNumber+secondNumber;
				firstNumber=secondNumber;
				secondNumber=result;
					
		}
			
		}
}


