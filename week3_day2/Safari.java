package week3.day2;

public class Safari extends Browser{

	public void readerMode() {
		// TODO Auto-generated method stub
		System.out.println("readerMode");
	}
	
	public void fullScreenMode() {
		// TODO Auto-generated method stub
		System.out.println("fullScreenMode");


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Safari safariOptions=new Safari();
		safariOptions.readerMode();
		safariOptions.fullScreenMode();
		safariOptions.openURL();
		safariOptions.closeBrowser();
		safariOptions.navigateBack();

	}

}
