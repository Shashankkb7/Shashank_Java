class FoodItemsDataOperator
{
	static String[] foodNames={null,null,null,null,null};
	static int position=0;
	static void save(String foodName)
	{
		System.out.println("save:nadita ide");
		foodNames[position]=foodName;
		System.out.println("Saved food name:"+foodName+"at position:"+position);
		position++;
		System.out.println("Next position of ref"+position);
		System.out.println("save:mugitu");
	}
	static void displayDetails()
	{
		for(int index=0;index<foodNames.length;index++)
		{
			String ref=foodNames[index];
			System.out.println("elements:"+ref);
		}
	}
}