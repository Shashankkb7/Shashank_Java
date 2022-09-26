class MovieDataOperator{
	static String[] movieNames={null,null,null,null,null,null};
	static int position=0;
	static void save(String movieName)
	
	{
		System.out.println("save: start aytu");
		movieNames[position]=movieName;
		System.out.println("saved movie name:"+ movieName+"movie position:"+position);
		position++;
		System.out.println("Next movie position"+ position);
		System.out.println("save: mugitu");
	}
	static void displayDetails()
	{
		for(int index=0;index<movieNames.length;index++)
		{
			String ref=movieNames[index];
			System.out.println("elements:"+ref);
		}
	}
}