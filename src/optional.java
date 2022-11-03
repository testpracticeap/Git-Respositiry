import java.util.Optional;

public class optional {

	public static void main(String[] args) {
		String[] strings=new  String[5];
		Optional<String>nullCheckOptional=Optional.ofNullable(strings[3]);
		if(nullCheckOptional.isPresent())
		{
			
			String string=strings[3].toUpperCase();
			
			System.out.println(string);
		}
		else {
			{
				
				System.out.println("String is null");
				
			}
		}
		

	}

}
