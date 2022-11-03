import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class forEachremaining {

	public static void main(String[] args) {
		List<Integer>list2=Arrays.asList(5,10);
		
		Iterator<Integer>itr=list2.iterator();
		itr.forEachRemaining(list->System.out.println(list));
		
		//split Interface
		
List<Integer>list5=Arrays.asList(10,20);
		
		Spliterator<Integer>strSpliterator=list5.spliterator();
		
		while(strSpliterator.tryAdvance(list->System.out.println(" Split iterator:"+list)));
		
		
		
		
		
		

	}

}
