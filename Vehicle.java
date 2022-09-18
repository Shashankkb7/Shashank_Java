class Vehicle{
	static double transport(String source,int destination)
	{
		System.out.println("entered transport String,int");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		if(source=="Banglore" && destination==200)
		{
			System.out.println("journey starts from Banglore and ends in hosadurga in km");
			return 200;
			
		}
		return 0;
	}
	static double transport(String source,int destination,boolean ontime)
	{
		System.out.println("entered transport String,int,boolean");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("ontime:"+ontime);
		if(source=="Tiptur" && destination==125 && ontime==true)
		{
			System.out.println("journey starts from Tiptur and reached ontime");
			return 125;
		}
		return 0;
	}
	static boolean transport(boolean destination)
	{
		System.out.println("entered transport int");
		System.out.println("destination:"+destination);
		if(destination==true)
		{
			System.out.println("destination reached intime");
			return true;
		}
		return false;
	}
	static boolean transport(int destination,boolean ontime)
	{
		System.out.println("entered transport int,ontime");
		System.out.println("destination:"+destination);
		System.out.println("ontime:"+ontime);
		if(destination==450 && ontime==true)
		{
			System.out.println("destination reached ontime");
			return false;
		}
		return true;
	}
	static boolean driving(boolean ontime)
	{
		System.out.println("ontime:"+ontime);
		if(ontime==false)
		{
			return false;
		}
		return true;
	}
}	