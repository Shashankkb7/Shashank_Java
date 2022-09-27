class Colors{
	
	static String[] colorNames={null,null,null,null,null,null,null};
	static int position=0;
	static void save(String colors)
	{
		System.out.println("save:nadita ide");
		
		if(position>7)
		{
			System.err.println("Colors name exceed");
			return;
		}
		if(colors!=null && colors.length()>=3)
		{
		colorNames[position]=colors;
		System.out.println("Saved color name:"+ colors +"at position:"+position);
		position++;
		System.out.println("Next position of ref"+position);
		System.out.println("save: mugitu");
		}
		else
		{
		System.out.println("color name is not null");
		}
	}
	
	static void displayDetails()
	{
		for(int index=0;index<colorNames.length;index++)
		{
			String ref=colorNames[index];
			System.out.println("elements:"+ref);
		}
	}
	
	static boolean findColors(String name)
	{
			System.out.println("finding color :"+ name);
			for(int find=0;find<colorNames.length;find++)
			{
				String ref=colorNames[find];
				if(ref==name)
				{
					System.out.println("color found"+ name);
					return true;
				}
			}
			return false;
			
	}
	
}