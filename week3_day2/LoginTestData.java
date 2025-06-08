package week3.day2;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		// TODO Auto-generated method stub
		System.out.println("username");
	}
	
	public void enterPassword() {
		// TODO Auto-generated method stub
		System.out.println("password");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTestData login=new LoginTestData();
		login.enterCredentials();
		login.navigateToHomePage();
		login.enterUsername();
		login.enterPassword();
	}

}
