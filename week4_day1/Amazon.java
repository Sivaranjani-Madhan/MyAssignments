package week4.day1;

public class Amazon extends CanaraBank{

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		
		System.out.println("cashOnDelivery");
		
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		
		System.out.println("upiPayments");
		
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("cardPayments");
		
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("internetBanking");
		
	}

	@Override
	public void recordPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("recordPaymentDetails");
		
	}
	
	public static void main(String[] args) {
		
		Amazon amazonOptions=new Amazon();
		amazonOptions.cardPayments();
		amazonOptions.cardPayments();
		amazonOptions.internetBanking();
		amazonOptions.recordPaymentDetails();
		amazonOptions.upiPayments();
	}
	
	
	

}
