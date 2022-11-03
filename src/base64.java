import java.util.Base64;

public class base64 {

	public static void main(String[] args) {
		
Base64.Encoder encoder=Base64.getUrlEncoder();	
String uRLEncoderString=encoder.encodeToString("http//google.com/".getBytes());
System.out.println(uRLEncoderString);
		

	}

}
