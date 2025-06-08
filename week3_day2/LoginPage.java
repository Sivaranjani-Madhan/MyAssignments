package week3.day2;

public class LoginPage extends BasePage {
	
	@Override
	public void performCommonTasks() {
		// TODO Auto-generated method stub
		super.performCommonTasks();
	}
	
	public static void main(String[] args) {
		
		LoginPage loginOptions=new LoginPage();
		loginOptions.clickElement();
		loginOptions.findElement();
		loginOptions.enterText();
		loginOptions.performCommonTasks();
	}

}
