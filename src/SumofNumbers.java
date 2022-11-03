import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class SumofNumbers {

	public static void main(String[] args) {
		
List<Integer>list = new ArrayList<>();
list.add(1);
list.add(2);
list.add(13);
Iterator<Integer> it=list.iterator();

int sum=0;

while(it.hasNext())
{
	
	int num=it.next();
	
	if(num<=10)
	{
		
		sum=sum+num;
	}
	
	
}
	System.out.println(sum);
		
	}

}