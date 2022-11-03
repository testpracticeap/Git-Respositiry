import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	
	int id;
	String name;
	Float price;
	
	public Product(int i, String name, Float price)
	{
		this.id=this.id;
		this.name=name;
		this.price=price;
		
		
	}
	
	
	
	
}







public class Stream {
	
	
	

	public static void main(String[] args) {

List<Product>productList=new ArrayList<Product> ();

productList.add(new Product(1,"Switch",20f));

productList.add(new Product(2,"fan",2000f));

List<Float> priceList=productList.stream().filter(p->p.price>10).map(p->p.price).collect(Collectors.toList());

System.out.println(priceList);

Float priceList2=productList.stream().map(p->p.price).reduce(0.0f,(sum,price)->sum +price);

System.out.println(priceList2);






	}

}
