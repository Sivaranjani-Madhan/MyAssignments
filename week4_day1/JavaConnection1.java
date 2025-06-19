package week4.day1;

//Home Assignment <3B>: Demonstrating Abstraction in Java
public class JavaConnection1 extends MySqlConnection{

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
		System.out.println("executeUpdate");
		
	}
	
	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("executeQuery");
		
	}
	
	public static void main(String[] args) {
		JavaConnection1 connection=new JavaConnection1();
		connection.connect();
		connection.disconnect();
		connection.executeUpdate();
		connection.executeQuery();
	}

	

	

}
