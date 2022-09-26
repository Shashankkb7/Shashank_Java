class GraduateDataOperator{
	static String[] graduateNames={null,null,null,null,null};
	static int position=0;
	static void save(String graduateName)
	{
		System.out.println("save:start aytu");
		graduateNames[position]=graduateName;
		System.out.println("Saved graduate names:"+position+"at position"+position);
		position++;
		System.out.println("Next position of ref:"+position);
		System.out.println("save:mugitu");
	}
	static void displayDetails()
	{
		for(int index=0;index<graduateNames.length;index++)
		{
			String ref=graduateNames[index];
			System.out.println("elements:"+ref);
		}
	}
}