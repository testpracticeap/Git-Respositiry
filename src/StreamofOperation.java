import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamofOperation {

	public static void main(String[] args) {
		Stream<Integer>stream=Stream.of(1,2,3,4);
//		List<Integer>myList=new ArrayList<>();
//		for(int i=0;i<40;i++)
//		
//			myList.add(i);
//			Stream<Integer>stream1=myList.stream();
//		
//			
//			Stream <String> string1=Stream.generate(()->{return "abc";});
//			
//			
//			
//			
//			Stream <String> string2=Stream.iterate("abc", (i)->i);
//			
//			LongStream lStream=Arrays.stream(new long[] {1,2 });
//			
//			IntStream is2="rtc".chars();
//			
		
//		Stream<Integer>Int1=Stream.of(1,2);
//		
//	List<Integer>inList=Int1.collect(Collectors.toList());
//		
//	System.out.println(inList);	
//	Int1=Stream.of(1,2);
//	Map<Integer, Integer> intMap=Int1.collect(Collectors.toMap(i->i, i->i+10));
//	System.out.println(intMap);	
//	
//	Stream<Integer>Int2=Stream.of(1,2,3 ,4);
//	
//	Integer[] intArrayIntegers=Int2.toArray(Integer[]::new);
//	System.out.print(Arrays.toString(intArrayIntegers));
//	
//	Stream<String>name=Stream.of("zq", "by");
//	List<String>REVERSE= name.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//	
//	System.out.print(REVERSE);
//	
//
//	Stream<String>name2=Stream.of("zq", "by");
//	
//	List<String>sort= name2.sorted().collect(Collectors.toList());
//	
//	System.out.print(sort);
	
	Stream<Integer>Int2=Stream.of(1,2,3 ,4);
	
	System.out.print(Int2.count()+"\n");//4
	
	Int2=Stream.of(1,2,3 ,4);
	
	Int2.forEach(i->System.out.print(i+","));
	
	Int2=Stream.of(1,2,3 ,4);
	
	System.out.print(Int2.anyMatch(i->i==10));//4
	
	
	
	
	
	
	
	
	
	
		
	}

}
