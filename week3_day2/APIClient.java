package week3.day2;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		// TODO Auto-generated method stub
		
		System.out.println("endpoint is " +endpoint);

	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		// TODO Auto-generated method stub
		
		System.out.println("endpoint is " +endpoint + " requestBody is " +requestBody + " requestStatus " +requestStatus);
		
	}
	
	public static void main(String[] args) {
		
		APIClient apiOptions=new APIClient();
		apiOptions.sendRequest("http");
		apiOptions.sendRequest("https", "body", true);
	}

}
