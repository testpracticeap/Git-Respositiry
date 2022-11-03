

interface  default_interface{
	
	 void display();
	
	
	
}
		
	class derived_class
	{
		
		public void Test1()
		{
			
			System.out.println("second  application");
		}	
		
	}
			
			
		



public class Methodreferences {
	
	
	public static void main(String[] args)
	{
		
		derived_class objChildclass=new derived_class();
		
		default_interface obj2=objChildclass::Test1;
		obj2.display();
		
				
		
	}
	
	
	

}
