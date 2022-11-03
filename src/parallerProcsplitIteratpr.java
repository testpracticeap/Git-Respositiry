import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class parallerProcsplitIteratpr {

	public static void main(String[] args) {
		List<String>str=Arrays.asList("rat", "cat", "mouse", "dog");
Spliterator<String>str1=str.spliterator();
Spliterator<String>str2=str1.trySplit();
		
	System.out.println("Split Itearor 1 :");
	str1.forEachRemaining(value->System.out.println(value));
	
	System.out.println("Split Itearor 2 :");
	str2.forEachRemaining(value->System.out.println(value));
		
		
		

	}

}
