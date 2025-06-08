package week3.day2;

public class Edge extends Browser {

	public void takeSnap() {
		// TODO Auto-generated method stub
		System.out.println("takeSnap");
}
	
	public void clearCookies() {
		// TODO Auto-generated method stub
		System.out.println("clearCookies");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge edgeOptions=new Edge();
		edgeOptions.clearCookies();
		edgeOptions.takeSnap();
		edgeOptions.openURL();
		edgeOptions.closeBrowser();
		edgeOptions.navigateBack();

	}

}
