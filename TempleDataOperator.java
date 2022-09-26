class TempleDataOperator{
	static String[] templeNames={null,null,null,null,null,null};
	static int position=0;
	static void save(String templeName)
	
	{
		System.out.println("save: start aytu");
		templeNames[position]=templeName;
		System.out.println("saved temple Name:"+ templeName+"temple position:"+position);
		position++;
		System.out.println("Next temple position"+ position);
		System.out.println("save: mugitu");
	}
	static void displayDetails()
	{
		for(int index=0;index<templeNames.length;index++)
		{
			String ref=templeNames[index];
			System.out.println("elements:"+ref);
		}
	}
}