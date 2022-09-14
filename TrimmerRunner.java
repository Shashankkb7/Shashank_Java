class TrimmerRunner{
	
	public static void main(String[] hair){
		
		System.out.println(Trimmer.color);
		System.out.println(Trimmer.price);
		System.out.println(Trimmer.brand);
		System.out.println(Trimmer.working);
		System.out.println(Trimmer.warranty);
		System.out.println(Trimmer.totalFeatures);
		for(int index=0; index<Trimmer.totalFeatures.length;index++)
		{
			String ref1=Trimmer.totalFeatures[index];
			System.out.println("Trimmer  features : "+index+"name: "+ref1);
		}
		{
			Trimmer.color="Blue";
			Trimmer.price=1456;
			Trimmer.brand="NOVA";
			Trimmer.working=false;
			Trimmer.warranty=3;
			
		System.out.println(Trimmer.color);
		System.out.println(Trimmer.price);
		System.out.println(Trimmer.brand);
		System.out.println(Trimmer.working);
		System.out.println(Trimmer.warranty);
			

		}
	}
}