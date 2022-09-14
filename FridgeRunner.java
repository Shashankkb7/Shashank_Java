class FridgeRunner{
	
	public static void main(String[] cool)
	{
		System.out.println("entering the fridgerunner main method");
		
		{
			String name=Fridge.name;
			String color=Fridge.color;
			String countryOrigin=Fridge.countryOrigin;
			byte rating=Fridge.rating;
			int capacity=Fridge.capacity;
			int weight=Fridge.weight;
			short model=Fridge.model;
			long height=Fridge.height;
			
			System.out.println(name);
			System.out.println(color);
			System.out.println(countryOrigin);
			System.out.println(rating);
			System.out.println(capacity);
			System.out.println(weight);
			System.out.println(model);
			System.out.println(height);
			
		}
	}
}