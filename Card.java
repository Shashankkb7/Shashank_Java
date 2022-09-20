class Card{
	
	static String type;
	static int height;
	static int width;
	static double price;
	static String[] color;
	
	static void displayDetails()
	{
		System.out.println(type);
		System.out.println(height);
		System.out.println(width);
		System.out.println(price);
		if(color!=null)
		{
			System.out.println("array is pointing to colors");
			for(int position=0;position<color.length;position++)
			{
			String ref=color[position];
			System.out.println(ref +"position"+position);
			}
		}
		else
		{
			System.out.println("array is not pointing to colors");
		}
	}
}