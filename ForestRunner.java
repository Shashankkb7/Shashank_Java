class ForestRunner{
	
	public static void main(String[] wild){
		
		System.out.println(Forest.name);
		System.out.println(Forest.totalArea);
		System.out.println(Forest.type);
		System.out.println(Forest.region);
		System.out.println(Forest.primaryAnimals);
		for(int index=0; index<Forest.primaryAnimals.length;index++)
		{
			String ref1=Forest.primaryAnimals[index];
			System.out.println("Animals  Name : "+index+"name: "+ref1);
		}
		{
			Forest.name="Bhadra wildlife sanctuary";
			Forest.totalArea=983.21;
			Forest.type="Evergreen Forest";
			Forest.region="India";
			
			System.out.println(Forest.name);
			System.out.println(Forest.totalArea);
			System.out.println(Forest.type);
			System.out.println(Forest.region);
			

		}
	}
}