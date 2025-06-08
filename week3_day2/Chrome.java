package week3.day2;

public class Chrome extends Browser{

	public void openIncognito() {
		// TODO Auto-generated method stub

		System.out.println("openIncognito");
	}
	
	public void clearCache() {
		// TODO Auto-generated method stub
		System.out.println("clearCache");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chrome chromeOptions=new Chrome();
		chromeOptions.clearCache();
		chromeOptions.openIncognito();
		chromeOptions.openURL();
		chromeOptions.closeBrowser();
		chromeOptions.navigateBack();

	}

}
