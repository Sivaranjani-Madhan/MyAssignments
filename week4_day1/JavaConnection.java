package week4.day1;

//Home Assignment <3A>: Demonstrating Interface in Java
public class JavaConnection implements DatabaseConnection{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connect");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("excuteUpdate");	
	}
	
	public static void main(String[] args) {
		
		JavaConnection connection=new JavaConnection();
		connection.connect();
		connection.disconnect();
		connection.executeUpdate();
	}
	

}
