class GeyserRunner{
	
	public static void main(String[] hot)
	{
		System.out.println("entering the GeyserRunner main method");
		{
			String brand=Geyser.brand;
			String color=Geyser.color;
			String countryOrigin=Geyser.countryOrigin;
			byte rating=Geyser.rating;
			int capacity=Geyser.capacity;
			double width=Geyser.width;
			short model=Geyser.model;
			float height=Geyser.height;
			
			System.out.println(brand);
			System.out.println(color);
			System.out.println(countryOrigin);
			System.out.println(rating);
			System.out.println(capacity);
			System.out.println(width);
			System.out.println(model);
			System.out.println(height);
		}
	}
}