	
interface interface_default
{
	
	default void legacyversion()
	{
		
		System.out.println("support legacy version");
	}

	default void newversion()
	{
		
		System.out.println("support new version");
	}
	
	
}



class childclass implements interface_default
{
	
	
	
}



class Main
{
	
	public static void main(String[] args)
	{
		childclass objChildclass=new childclass();
		
		objChildclass.legacyversion();
		
	}
	
	
}
	

