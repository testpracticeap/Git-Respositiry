import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

public class forEach {

	public static void main(String[] args) {
		List<String> addLetterList=new ArrayList<String>();
		addLetterList.add("L");
		addLetterList.add("O");
		addLetterList.add("M");
		addLetterList.forEach(List->System.out.println((List)));
		
		

	}

}








