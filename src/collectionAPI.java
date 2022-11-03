import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class collectionAPI {

	public static void main(String[] args) {
		
		
		//java 7
		List<Integer>list=Arrays.asList(5,10);
		
		for(int num:list)
		{
			System.out.println(num);
			
		}
		
		//java 8 more concise
		List<Integer>list2=Arrays.asList(5,10);
		list2.forEach(num->System.out.println(num));
		
		
		//Collection.removeIf
		
		//java 7
		List<Integer>list3=new ArrayList<>();
		
		list3.add(1);
		list3.add(2);
		
		List<Integer>outIntegers=new ArrayList<Integer>();
		
		for(int num:list3)
		{
			if(num%2!=0)
			{
				outIntegers.add(num);
				System.out.println(num);
				
			}
			
			
			
		}
		
		//java 8
		
List<Integer>list4=new ArrayList<>();
		
		list4.add(1);
		list4.add(2);
		
		boolean sucess=list4.removeIf(num->(num%2==0));
		
		if(sucess)
		{
			
			list4.forEach(num->System.out.println(num));
		}
		
		
		
	}

}
