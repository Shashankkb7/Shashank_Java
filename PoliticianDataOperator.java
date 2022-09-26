class PoliticianDataOperator
{
	static String[] politicianNames={null,null,null,null,null};
	static int position=0;
	static void save(String politicianName)
	{
		System.out.println("save:nadita ide");
		politicianNames[position]=politicianName;
		System.out.println("Saved politician name:"+politicianName+"at position:"+position);
		position++;
		System.out.println("Next position of ref"+position);
		System.out.println("save:mugitu");
	}
	static void displayDetails()
	{
		for(int index=0;index<politicianNames.length;index++)
		{
			String ref=politicianNames[index];
			System.out.println("elements:"+ref);
		}
	}
}